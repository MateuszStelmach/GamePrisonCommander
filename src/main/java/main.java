import com.gameprison.astrologyinfluance.BirthChart;
import com.gameprison.astrologyinfluance.City;
import com.gameprison.astrologyinfluance.FourElements;
import com.gameprison.prisoner.ElementBalance;
import cz.kibo.api.astrology.builder.PlanetBuilder;
import cz.kibo.api.astrology.builder.TransitBuilder;
import cz.kibo.api.astrology.domain.Planet;
import cz.kibo.api.astrology.domain.Transit;

import java.time.LocalDateTime;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;


public class main {
    public static void main(String[] args) {
        LocalDateTime event = LocalDateTime.now();
        LocalDateTime compereEvent = LocalDateTime.now();
        List<LocalDateTime> tranistList = new ArrayList<>();

        for (int i = 0; i < 45; i++) {


            Transit transit = new TransitBuilder(event)
                    .planet("Moon")
                    .toPlanet("Sun")
                    .aspect(180.0)
                    .build();
            if (!tranistList.contains(transit.getDate()) && transit.getDate().isBefore(compereEvent.plusDays(45))) {
                tranistList.add(transit.getDate());
            }
            event = event.plusDays(1);


        }
        tranistList.iterator().forEachRemaining(System.out::println);
        City city = City.generateCity();
        BirthChart birthChart = new BirthChart(city, BirthChart.generateBirthTime());
        ElementBalance elementBalance = new ElementBalance(birthChart);
        System.out.println(elementBalance.getElementBalance().get(FourElements.FIRE.name()) + " fire");
        System.out.println(elementBalance.getElementBalance().get(FourElements.AIR.name()) + " air");
        System.out.println(elementBalance.getElementBalance().get(FourElements.WATER.name()) + " water");
        System.out.println(elementBalance.getElementBalance().get(FourElements.EARTH.name()) + " earth");


    }


}

