package com.napier.groupF;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    static App app;
    @BeforeAll
    static void init() {
        app = new App();
        app.connect("localhost:33060");
    }

    @Test
    // test return if countries is null
    void displayCountriesTestNull() {
        app.displayCountries(null);
    }

    @Test
    // test return if displayCountries returns an empty list
    void displayCountriesTestEmpty() {
        ArrayList<Country> countries= new ArrayList<Country>();
        app.displayCountries(countries);
    }

    @Test
    // test return if cities is null
    void displayCitiesTestNull() {
        app.displayCities(null);
    }

    @Test
    // test return if displayCities returns an empty list
    void displayCitiesTestEmpty() {
        ArrayList<City> cities= new ArrayList<City>();
        app.displayCities(cities);
    }

    @Test
    // test return if topCitiesContinent is given an invalid continent
    void topCitiesContinentInvalid(){
        app.topCitiesContinent(10, "Europa");
    }

    @Test
    // test return if topCitiesContinent is given valid parameters
    void topCitiesContinentTest(){
        app.topCitiesContinent(10, "Europe");
    }
}


