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

    @Test
        // test return if capitals is null
    void displayCapitalsTestNull() {
        app.displayCapitals(null);
    }

    /**
     * test return if displayCapitals returns an empty list
     */
    @Test

    void displayCapitalsTestEmpty() {
        ArrayList<Capital> capitals= new ArrayList<Capital>();
        app.displayCapitals(capitals);
    }

    @Test
        // test return if TopContinentCapital is given an invalid continent
    void topContinentCapitalInvalid(){
        app.TopContinentCapital(10, "Europa");
    }

    @Test
        // test return if TopContinentCapital is given valid parameters
    void topContinentCapitalTest(){
        app.TopContinentCapital(10, "Europe");
    }

    @Test
        // test return if TopRegionCapital is given an invalid Region
    void topRegionCapitalInvalid(){
        app.TopRegionCapital(10, "Nort Europ");
    }

    @Test
        // test return if TopRegionCapital is given valid parameters
    void topRegionCapitalTest(){
        app.TopRegionCapital(10, "Northern Europe");
    }
}


