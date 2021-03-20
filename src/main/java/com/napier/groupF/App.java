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
        App a = new App();

        // Connect to database
        a.connect();
        // Get city
//        City c = a.getCity("London");
        ArrayList<City> cities = a.listCities("Europe");
        // Display results
//        a.displayCity(c);
        a.displayCities(cities);
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
//                con = DriverManager.getConnection("jdbc:mysql://localhost:33060/world?useSSL=true", "root", "example");

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

//    public City getCity(String name) {
//        try {
//            // Create an SQL statement
//            Statement stmt = con.createStatement();
//            // Create string for SQL statement
//
//            String strSelect = "SELECT ID, Name, CountryCode, District, Population " +
//                    "FROM city " +
//                    "WHERE Name = '" + name + "'";
//            // Execute SQL statement
//            ResultSet rset = stmt.executeQuery(strSelect);
//            //Return city if valid
//            //Check one is returned
//            if (rset.next()) {
//                City c = new City();
////                c.ID = rset.getInt("ID");
//                c.Name = rset.getString("Name");
//                c.CountryCode = rset.getString("CountryCode");
//                c.District = rset.getString("District");
//                c.Population = rset.getInt("Population");
//                return c;
//            } else
//                return null;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("Failed to get City details");
//            return null;
//            }
//        }

    public ArrayList<City> listCities(String continent) {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population " +
                            "FROM city JOIN country ON city.CountryCode = country.Code " +
                            "WHERE country.Continent = '" + continent + "'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<City> cities = new ArrayList<City>();
            while (rset.next()) {
                City c = new City();
                c.Name = rset.getString("city.Name");
                c.CountryCode = rset.getString("city.CountryCode");
                c.District = rset.getString("city.District");
                c.Population = rset.getInt("city.Population");
                cities.add(c);
            }
            return cities;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;

        }
    }

    public void displayCities(ArrayList<City> cities)
    {
        // Check cities is not null
        if (cities == null)
        {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("Cities List");
        // Loop over all cities in the list
        for (City c : cities)
        {
            String city_string = ("Name: " + c.Name + "\n" +
                    "Country: " + c.CountryCode + "\n" +
                    "District: " + c.District + "\n" +
                    "Population: " + c.Population);
            System.out.println(city_string);
        }
    }

//        public void displayCity(City c) {
//        if (c != null) {
//            System.out.println("ID: "+ c.ID + "\n" +
//                    "Name: " + c.Name + "\n" +
//                    "Country: " + c.CountryCode + "\n" +
//                    "District: " + c.District + "\n" +
//                    "Population: " + c.Population);
//            }
//        }

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