import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;

import pl.com.stelmach.gameprison.astrologyinfluance.FourElements;
import pl.com.stelmach.gameprison.astrologyinfluance.GenerateData;
import pl.com.stelmach.gameprison.prisoner.CharacterQuality;
import pl.com.stelmach.gameprison.prisoner.ElementBalance;

import cz.kibo.api.astrology.builder.TransitBuilder;

import cz.kibo.api.astrology.domain.Transit;
import pl.com.stelmach.gameprison.prisoner.PrisonerStat;

import java.time.LocalDateTime;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;


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

        BirthChart birthChart = new BirthChart(GenerateData.generateCity(), GenerateData.generateBirthTime());
        ElementBalance elementBalance = new ElementBalance(birthChart);
        for (FourElements value : FourElements.values()) {
            System.out.println(elementBalance.getElementBalance().get(value) + " " + value.name());
        }

        PrisonerStat prisonerStat = new PrisonerStat(birthChart);
        for (Map.Entry<CharacterQuality, Integer> entry : prisonerStat.getPrisonerStat().entrySet()) {
            System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
        }


    }


}

