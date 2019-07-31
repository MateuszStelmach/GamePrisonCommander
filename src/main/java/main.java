import cz.kibo.api.astrology.domain.Coordinates;
import pl.com.stelmach.gameprison.astrologyinfluance.*;

import cz.kibo.api.astrology.builder.TransitBuilder;

import cz.kibo.api.astrology.domain.Transit;
import pl.com.stelmach.gameprison.person.CharacterQuality;
import pl.com.stelmach.gameprison.person.CharacterQualityBalance;
import pl.com.stelmach.gameprison.person.Personality;

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


        for (Object o : birthChart.getHousesPosition().getCusps().toArray()) {
            System.out.println(o);
        }

        HouseBalance houseBalance = new HouseBalance(birthChart);
        for (Map.Entry<Houses, Integer> entry : houseBalance.getHouseBalance().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Coordinates coordinates = new Coordinates(50.49, 19.08, 173);
        LocalDateTime localDateTime = LocalDateTime.of(2000, 1, 1, 10, 0);
        BirthChart birthChartTest = new BirthChart(new City("Big city", coordinates), localDateTime);

        for (HeavenCelestial heavenCelestial : HeavenCelestial.values()) {
            System.out.println(birthChartTest.getPlanetPositionInt(heavenCelestial.getName()) + " " + heavenCelestial.getName());

        }

        System.out.println("/////////////////");
        for (Houses houses : Houses.values()) {
            System.out.println(houses + " " + birthChartTest.getHousePositionInt(houses.getPositionNumber()));
        }

        System.out.println("////////////");

        ElementBalance testbalance = new ElementBalance(birthChartTest);
        for (FourElements fourElements : FourElements.values()) {
            System.out.println(fourElements + " " + testbalance.getElementBalance().get(fourElements));
        }

        HouseBalance testhousebalance = new HouseBalance(birthChartTest);
        for (Houses houses : Houses.values()) {
            System.out.println(houses + " " + testhousebalance.getHouseBalance().get(houses));
        }

        System.out.println("///////////////");
        HouseBalance testhousebalance2 = new HouseBalance(birthChart);
        for (Houses houses : Houses.values()) {
            System.out.println(houses + " " + testhousebalance2.getHouseBalance().get(houses));
        }

        System.out.println("////////////");
        ZodiacSignBalance zodiacSignBalance1 = new ZodiacSignBalance(birthChartTest);
        for (ZodiacSign zodiacSign : ZodiacSign.values()) {
            System.out.println(zodiacSign + " " + zodiacSignBalance1.getZodiacSignBalance().get(zodiacSign));
        }

        HeavenCelestialBalance heavenCelestialBalance = new HeavenCelestialBalance(birthChartTest);
        for (HeavenCelestial heavenCelestial : HeavenCelestial.values()) {
            System.out.println(heavenCelestial + " " + heavenCelestialBalance.getHeavenCelestialMap().get(heavenCelestial));
        }

        Personality personality = new Personality(elementBalance, houseBalance, heavenCelestialBalance, zodiacSignBalance1);
        CharacterQualityBalance characterQualityBalance = new CharacterQualityBalance(personality);
        for (CharacterQuality characterQuality : CharacterQuality.values()) {
            System.out.println(characterQualityBalance.getChQualityStrength(characterQuality) + " " +
                    characterQuality);
        }


    }


}

