package com.napier.groupF;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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

    @Test
    void testGetCountry()
    {
        Country c = app.getCountry("France");
        assertEquals(c.Name, "France");
        assertEquals(c.Code, "FRA");
        assertEquals(c.Region, "Western Europe");
        assertEquals(c.Population, 59225700);
    }

    @Test
    void testGetCity()
    {
        City c = app.getCity("Edinburgh");
        assertEquals(c.Name, "Edinburgh");
        assertEquals(c.CountryCode, "GBR");
        assertEquals(c.District, "Scotland");
        assertEquals(c.Population, 450180);
    }
}