package com.napier.groupF;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060");
    }

    /**
     * Testing that expected results returned for Countries
     * Data from world.sql
     * Accessed on 29/04/21
     */
    @Test
    void testGetCountry()
    {
        Country c = app.getCountry("France");
        assertEquals(c.Name, "France");
        assertEquals(c.Code, "FRA");
        assertEquals(c.Region, "Western Europe");
        assertEquals(c.Population, 59225700);
    }
    /**
     * Testing that expected results returned for Cities
     * Data from world.sql
     * Accessed on 29/04/21
     */
    @Test
    void testGetCity()
    {
        City c = app.getCity("Edinburgh");
        assertEquals(c.Name, "Edinburgh");
        assertEquals(c.CountryCode, "GBR");
        assertEquals(c.District, "Scotland");
        assertEquals(c.Population, 450180);
    }
    /**
     * Testing that expected results returned for Capitals
     * Data from world.sql
     * Accessed on 29/04/21
     */
    @Test
    void testGetCapital()
    {
        Capital ca = app.getCapital("France");
        assertEquals(ca.Name, "Paris");
        assertEquals(ca.Country, "France");
        assertEquals(ca.Population, 2125246);
    }
}