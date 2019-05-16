package com.gamePrison.AstrologyInfuence;

import com.gamePrison.astrologyInfluance.City;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {
    City city = City.generateCity();

    @Test
    public void coordinatesTest() {
        assertEquals(49, city.getCoordinates().getLatitude(), 6);
        assertEquals(14, city.getCoordinates().getLongitude(), 11);
        assertEquals(173, city.getCoordinates().getGeoalt(), 0);


    }
}
