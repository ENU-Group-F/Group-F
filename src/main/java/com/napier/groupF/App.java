package com.napier.groupF;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
//import java.util.ArrayList;

    public class App {
        public static void main(String[] args) {
            // Create new Application
            com.napier.groupF.App a = new com.napier.groupF.App();

            // Connect to database
            a.connect();
            // Get city
//        City c = a.getCity("London");
            ArrayList<Country> countries = a.listCountires("Europe");
            // Display results
//        a.displayCity(c);
            a.displayCountries(countries);
            // Disconnect from database
            a.disconnect();
        }

        /**
         * Connection to MySQL database.
         */
        private Connection con = null;

        /**
         * Connect to the MySQL database.
         */
        public void connect() {
            try {
                // Load Database driver
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("Could not load SQL driver");
                System.exit(-1);
            }

            int retries = 10;
            for (int i = 0; i < retries; ++i) {
                System.out.println("Connecting to database...");
                try {
                    // Wait a bit for db to start
                    Thread.sleep(30000);
                    // Connect to database locally
                    //con = DriverManager.getConnection("jdbc:mysql://localhost:33060/world?useSSL=true", "root", "example");

                    // Connect to database inside docker
                    con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=true", "root", "example");

                    System.out.println("Successfully connected");
                    break;
                } catch (SQLException sqle) {
                    System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                    System.out.println(sqle.getMessage());
                } catch (InterruptedException ie) {
                    System.out.println("Thread interrupted? Should not happen.");
                }
            }
        }

        public ArrayList<Country> listCountires(String continent) {
            try {
                // Create an SQL statement
                Statement stmt = con.createStatement();
                // Create string for SQL statement
                String strSelect =
                        "SELECT country.Name, country.Code, country.Region, country.Population " +
                                "FROM country " +
                                "WHERE country.Continent = '" + continent + "'";
                // Execute SQL statement
                ResultSet rset = stmt.executeQuery(strSelect);
                // Extract city information
                ArrayList<Country> countries = new ArrayList<Country>();
                while (rset.next()) {
                    Country co = new Country();
                    co.Name = rset.getString("country.name");
                    co.Code = rset.getString("country.Code");
                    co.Region = rset.getString("country.Region");
                    co.Population = rset.getInt("country.Population");
                    countries.add(co);
                }
                return countries;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Failed to get country details");
                return null;

            }
        }

        public void displayCountries(ArrayList<Country> countries) {
            // Check cities is not null
            if (countries == null) {
                System.out.println("No countries");
                return;
            }
            // Print header
            System.out.println("Countries List");
            // Loop over all cities in the list
            for (Country co : countries) {
                String country_string = ("Name: " + co.Name + "\n" +
                        "Code: " + co.Code + "\n" +
                        "Region: " + co.Region + "\n" +
                        "Population: " + co.Population);
                System.out.println(country_string);
            }
        }



        /**
         * Disconnect from the MySQL database.
         */
        public void disconnect() {
            if (con != null) {
                try {
                    // Close connection
                    con.close();
                } catch (Exception e) {
                    System.out.println("Error closing connection to database");
                }
            }
        }
    }