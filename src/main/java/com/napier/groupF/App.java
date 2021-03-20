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
            a.connect("localhost:33060");
            //Get country
        Country c = a.getCountry("France");
            ArrayList<Country> countries = a.listCountires("Europe");
            // Display results
        a.displayCountry(c);
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
        public void connect(String location) {
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
                    //Connect to database locally
                    //con = DriverManager.getConnection("jdbc:mysql://localhost:33060/world?useSSL=true", "root", "example");

                    // Connect to database inside docker

                    con = DriverManager.getConnection("jdbc:mysql://" + location + "/world?allowPublicKeyRetrieval=true&useSSL=false", "root", "example");
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

        public Country getCountry(String name) {
        try {
           // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect = "SELECT  Name, Code, Region, Population " +
                    "FROM country " +
                    "WHERE Name = '" + name + "'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //Return country if valid
            //Check one is returned
            if (rset.next()) {
                Country c = new Country();
                c.Name = rset.getString("Name");
                c.Code = rset.getString("Code");
                c.Region = rset.getString("Region");
                c.Population = rset.getInt("Population");
                return c;
            } else
                return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
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
        public void displayCountry(Country c) {
        if (c != null) {
           System.out.println("Name: " + c.Name + "\n" +
                    "Country: " + c.Code + "\n" +
                    "Region: " + c.Region + "\n" +
                    "Population: " + c.Population);
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