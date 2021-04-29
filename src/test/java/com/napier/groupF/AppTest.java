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

    /**
     * test return if countries is null
     */
    @Test

    void displayCountriesTestNull() {
        app.displayCountries(null);
    }

    /**
     * test return if displayCountries returns an empty list
     */
    @Test
    void displayCountriesTestEmpty() {
        ArrayList<Country> countries= new ArrayList<Country>();
        app.displayCountries(countries);
    }

    /**
     * test return if topCountriesContinent is given an invalid continent
     */
    @Test
    void topContinentCountryInvalid(){app.topCountriesContinent(10, "Asai");
    }

    /**
     * test return is topCountriesContinent is given valid parameters
     */
    @Test
    void topContinentCountryTest(){
        app.topCountriesContinent(10, "Asia");
    }

    /**
     * test return if TopCountriesRegion is given an invalid Region
     */
    @Test
    void topRegionCountryInvalid(){app.TopCountriesRegion(10, "Nort Europ");
    }

    /**
     * test return if TopCountriesRegion is given valid Region
     */
    @Test
    void topRegionCountryTest(){ app.TopCountriesRegion(10, "Northern Europe");
    }

    /**
     * test return if cities is null
     */
    @Test
    void displayCitiesTestNull() {
        app.displayCities(null);
    }

    /**
     * test return if displayCities returns an empty list
     */
    @Test
    void displayCitiesTestEmpty() {
        ArrayList<City> cities= new ArrayList<City>();
        app.displayCities(cities);
    }

    /**
     * test return if topCitiesContinent is given an invalid continent
     */
    @Test
    void topCitiesContinentInvalid(){
        app.topCitiesContinent(10, "Europa");
    }

    /**
     * test return if topCitiesContinent is given valid parameters
     */
    @Test
    void topCitiesContinentTest(){
        app.topCitiesContinent(10, "Europe");
    }

    /**
     * test return if capitals is null
     */
    @Test
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

    /**
     * test return if TopContinentCapital is given an invalid continent
     */
    @Test
    void topContinentCapitalInvalid(){
        app.TopContinentCapital(10, "Europa");
    }

    /**
     * test return if TopContinentCapital is given a valid continent
     */
    @Test
    void topContinentCapitalTest(){
        app.TopContinentCapital(10, "Europe");
    }

    /**
     * test return if TopRegionCapital is given an invalid Region
     */
    @Test
    void topRegionCapitalInvalid(){
        app.TopRegionCapital(10, "Nort Europ");
    }

    /**
     * test return if TopRegionCapital is given a valid Region
     */
    @Test
    void topRegionCapitalTest(){
        app.TopRegionCapital(10, "Northern Europe");
    }
}


