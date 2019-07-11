package pl.com.stelmach.gameprison.person;

import static org.junit.Assert.*;

import org.junit.Test;
import pl.com.stelmach.gameprison.astrologyinfluance.ZodiacSign;

public class ZodiacSingTest {
    @Test
    public void isInSingTest() {
        assertTrue(ZodiacSign.ARIES.isInSign(10));
        assertTrue(ZodiacSign.TAURUS.isInSign(40));
        assertTrue(ZodiacSign.GEMINI.isInSign(70));
        assertTrue(ZodiacSign.CANCER.isInSign(100));
        assertTrue(ZodiacSign.lEO.isInSign(130));
        assertTrue(ZodiacSign.VIRGO.isInSign(160));
        assertTrue(ZodiacSign.LIBRA.isInSign(190));
        assertTrue(ZodiacSign.SCORPIO.isInSign(220));
        assertTrue(ZodiacSign.SIGGITARIUS.isInSign(250));
        assertTrue(ZodiacSign.CAPRICORN.isInSign(280));
        assertTrue(ZodiacSign.AQUARIUS.isInSign(320));
        assertTrue(ZodiacSign.PISCES.isInSign(340));

    }
}
