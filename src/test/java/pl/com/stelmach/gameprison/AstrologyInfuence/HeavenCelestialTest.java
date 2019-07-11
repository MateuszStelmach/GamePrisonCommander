package pl.com.stelmach.gameprison.AstrologyInfuence;
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

import cz.kibo.api.astrology.domain.Coordinates;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.astrologyinfluance.City;
import pl.com.stelmach.gameprison.astrologyinfluance.HeavenCelestial;

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

public class HeavenCelestialTest {
    private Coordinates coordinates = new Coordinates(50.49, 19.08, 173);
    private LocalDateTime localDateTime = LocalDateTime.of(2000, 1, 1, 10, 0);
    private BirthChart birthChart = new BirthChart(new City("Big city", coordinates), localDateTime);
    @Test
    public void heavenCelestialStrengthTest(){
        assertEquals(HeavenCelestial.SUN.heavenCelestialStrength(birthChart),0);
        assertEquals(HeavenCelestial.MOON.heavenCelestialStrength(birthChart),0);
        assertEquals(HeavenCelestial.MERCURY.heavenCelestialStrength(birthChart),0);
        assertEquals(HeavenCelestial.VENUS.heavenCelestialStrength(birthChart),3);
        assertEquals(HeavenCelestial.MARS.heavenCelestialStrength(birthChart),0);
        assertEquals(HeavenCelestial.JUPITER.heavenCelestialStrength(birthChart),1);
        assertEquals(HeavenCelestial.SATURN.heavenCelestialStrength(birthChart),1);
        assertEquals(HeavenCelestial.URANUS.heavenCelestialStrength(birthChart),3);
        assertEquals(HeavenCelestial.NEPTUNE.heavenCelestialStrength(birthChart),0);
        assertEquals(HeavenCelestial.PLUTO.heavenCelestialStrength(birthChart),3);

    }
}
