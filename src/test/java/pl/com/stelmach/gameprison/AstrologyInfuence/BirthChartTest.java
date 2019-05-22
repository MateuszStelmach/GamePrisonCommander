package pl.com.stelmach.gameprison.AstrologyInfuence;

import pl.com.stelmach.gameprison.astrologyinfluance.GenerateData;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class BirthChartTest {

    LocalDateTime birthTime = GenerateData.generateBirthTime();
    int expected = LocalDateTime.now().getYear() - 18;
    @Test
    public void birthTimeTest(){
        assertEquals(expected,birthTime.getYear(),52);//prisoner age 18-80;
    }

}
