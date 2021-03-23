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
    }

    @Test
    void displayCountriesTestNull() {
        app.displayCountries(null);
    }

    @Test
    void displayCountriesTestEmpty() {
        ArrayList<Country> countries= new ArrayList<Country>();
        app.displayCountries(countries);
    }

    @Test
    // test if cities is Null
    void displayCitiesTestNull() {
        app.displayCities(null);
    }
}

