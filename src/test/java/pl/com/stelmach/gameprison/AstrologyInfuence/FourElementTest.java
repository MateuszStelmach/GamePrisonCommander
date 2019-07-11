package pl.com.stelmach.gameprison.AstrologyInfuence;

import static org.junit.Assert.*;

import org.junit.Test;
import pl.com.stelmach.gameprison.astrologyinfluance.FourElements;

public class FourElementTest {
    private FourElements fireElement = FourElements.FIRE;
    private FourElements airElement = FourElements.AIR;
    private FourElements waterElement = FourElements.WATER;
    private FourElements earthElement = FourElements.EARTH;

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
}

