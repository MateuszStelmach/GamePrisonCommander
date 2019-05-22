package pl.com.stelmach.gameprison.AstrologyInfuence;

import pl.com.stelmach.gameprison.astrologyinfluance.City;

import static org.junit.Assert.*;

import pl.com.stelmach.gameprison.astrologyinfluance.GenerateData;
import org.junit.Test;

public class CityTest {
    City city = GenerateData.generateCity();

    @Test
    public void coordinatesTest() {
        assertEquals(49, city.getCoordinates().getLatitude(), 6);
        assertEquals(14, city.getCoordinates().getLongitude(), 11);
        assertEquals(173, city.getCoordinates().getGeoalt(), 0);


    }
}
