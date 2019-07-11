package pl.com.stelmach.gameprison.AstrologyInfuence;

import cz.kibo.api.astrology.domain.Coordinates;

import static org.junit.Assert.*;

import org.junit.Test;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.astrologyinfluance.City;
import pl.com.stelmach.gameprison.astrologyinfluance.Houses;

import java.time.LocalDateTime;

 /*
    FIRST 38
    SECOND 67
    THIRD 93
    FOURTH 118
    FIFTH 147
    SIXTH 181
    SEVENTH 218
    EIGTH 247
    NINTH 273
    TENTH 298
    ELEVENTH 327
    TWELFTH 1
     * Sun 10Cap14 - 280 zodiac degree
     * Moon 11Sco49 - 222 zodiac degree
     * Mercury 01Cap41 - 271 zodiac degree
     * Venus 01Sig24 - 241 zodiac degree
     * Mars 27Aq51 - 327 zodiac degree
     * Jupiter 25Ar14 - 25 zodiac degree
     * Saturn 10Tau23 - 40 zodiac degree
     * Uranus 14Aq40 - 314 zodiac degree
     * Neptun 03Aq11 - 303 zodiac degree
     * Pluton 11Sig27 - 251 zodiac degree
     * */


public class HousesTest {
    private Coordinates coordinates = new Coordinates(50.49, 19.08, 173);
    private LocalDateTime localDateTime = LocalDateTime.of(2000, 1, 1, 10, 0);
    private BirthChart birthChart = new BirthChart(new City("Big city", coordinates), localDateTime);

    @Test
    public void isInHouseTest() {

        assertTrue(Houses.FIRST.isInHouse(birthChart, 39));
        assertTrue(Houses.SECOND.isInHouse(birthChart, 68));
        assertTrue(Houses.THIRD.isInHouse(birthChart, 94));
        assertTrue(Houses.FOURTH.isInHouse(birthChart, 120));
        assertTrue(Houses.FIFTH.isInHouse(birthChart, 147));
        assertTrue(Houses.SIXTH.isInHouse(birthChart, 181));
        assertTrue(Houses.SEVENTH.isInHouse(birthChart, 220));
        assertTrue(Houses.EIGTH.isInHouse(birthChart, 250));
        assertTrue(Houses.NINTH.isInHouse(birthChart, 290));
        assertTrue(Houses.TENTH.isInHouse(birthChart, 300));
        assertTrue(Houses.ELEVENTH.isInHouse(birthChart, 0));
        assertTrue(Houses.TWELFTH.isInHouse(birthChart, 20));


    }
}
