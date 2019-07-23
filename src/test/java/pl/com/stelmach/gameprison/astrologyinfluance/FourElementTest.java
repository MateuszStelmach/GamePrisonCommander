package pl.com.stelmach.gameprison.astrologyinfluance;
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

import static org.junit.Assert.*;

import cz.kibo.api.astrology.domain.Coordinates;
import org.junit.Test;

import java.time.LocalDateTime;

public class FourElementTest {
    private FourElements fireElement = FourElements.FIRE;
    private FourElements airElement = FourElements.AIR;
    private FourElements waterElement = FourElements.WATER;
    private FourElements earthElement = FourElements.EARTH;
    private Coordinates coordinates = new Coordinates(50.49, 19.08, 173);
    private LocalDateTime localDateTime = LocalDateTime.of(2000, 1, 1, 10, 0);
    private BirthChart birthChart = new BirthChart(new City("Big city", coordinates), localDateTime);

    @Test
    public void cointainsElementTest() {
        assertTrue(fireElement.containsElement(15));
        assertTrue(fireElement.containsElement(130));
        assertTrue(fireElement.containsElement(250));

        assertTrue(airElement.containsElement(70));
        assertTrue(airElement.containsElement(190));
        assertTrue(airElement.containsElement(310));

        assertTrue(waterElement.containsElement(100));
        assertTrue(waterElement.containsElement(220));
        assertTrue(waterElement.containsElement(340));

        assertTrue(earthElement.containsElement(40));
        assertTrue(earthElement.containsElement(160));
        assertTrue(earthElement.containsElement(280));
    }

    @Test
    public void whatElementTest() {
        assertEquals(FourElements.whatElement(15), fireElement);
        assertEquals(FourElements.whatElement(130), fireElement);
        assertEquals(FourElements.whatElement(250), fireElement);

        assertEquals(FourElements.whatElement(70), airElement);
        assertEquals(FourElements.whatElement(190), airElement);
        assertEquals(FourElements.whatElement(310), airElement);

        assertEquals(FourElements.whatElement(100), waterElement);
        assertEquals(FourElements.whatElement(220), waterElement);
        assertEquals(FourElements.whatElement(340), waterElement);

        assertEquals(FourElements.whatElement(40), earthElement);
        assertEquals(FourElements.whatElement(160), earthElement);
        assertEquals(FourElements.whatElement(280), earthElement);
    }

    @Test
    public void elementStrengthTest(){
        assertEquals(fireElement.elementStrength(birthChart),10);
        assertEquals(airElement.elementStrength(birthChart),9);
        assertEquals(waterElement.elementStrength(birthChart),10);
        assertEquals(earthElement.elementStrength(birthChart),14);


    }
}

