package com.gamePrison.AstrologyInfuence;

import com.gamePrison.astrologyInfluance.BirthChart;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class BirthChartTest {

    LocalDateTime birthTime = BirthChart.generateBirthTime();
    int expected = LocalDateTime.now().getYear() - 18;
    @Test
    public void birthTimeTest(){
        assertEquals(expected,birthTime.getYear(),52);//prisoner age 18-80;
    }

}
