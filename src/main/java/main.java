import pl.com.stelmach.gameprison.astrologyinfluance.*;

import pl.com.stelmach.gameprison.person.CharacterQuality;
import pl.com.stelmach.gameprison.person.ElementBalance;

import cz.kibo.api.astrology.builder.TransitBuilder;

import cz.kibo.api.astrology.domain.Transit;
import pl.com.stelmach.gameprison.person.HouseBalance;
import pl.com.stelmach.gameprison.person.ZodiacSignBalance;
import pl.com.stelmach.gameprison.person.prisoner.PrisonerStatistic;

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

        PrisonerStatistic prisonerStatistic = new PrisonerStatistic(birthChart);
        for (Map.Entry<CharacterQuality, Integer> entry : prisonerStatistic.getPrisonerStat().entrySet()) {
            System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
        }

        for (Object o : birthChart.getHousesPosition().getCusps().toArray()) {
            System.out.println(o);
        }

        HouseBalance houseBalance = new HouseBalance(birthChart);
        for (Map.Entry<Houses, Integer> entry : houseBalance.getHouseBalance().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        ZodiacSignBalance zodiacSignBalance = new ZodiacSignBalance(birthChart);
        for (Map.Entry<ZodiacSign, Integer> entry : zodiacSignBalance.getZodiacSignBalance().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }


}

