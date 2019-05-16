import com.gamePrison.astrologyInfluance.BirthChart;
import com.gamePrison.astrologyInfluance.City;
import com.gamePrison.prisoner.ElementBalance;
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


        final double LONGITUDE = 16.0542676;
        final double LATITUDE = 48.8559107;
        final double GEOALT = 286;
        LocalDateTime eventX = LocalDateTime.of(2018, 3, 20, 16, 20);

        Planet ephemeris = new PlanetBuilder(eventX)
                .planet("Sun, Jupiter, Chiron")
                .build();
        System.out.println(ephemeris.getPlanets().get("Sun").get(0).intValue());
        System.out.println(ephemeris.getPlanets().get("Jupiter").get(0).intValue());

        Planet ephemerisNow = new PlanetBuilder(compereEvent)
                .planets()
                .build();
        System.out.println(ephemerisNow.getPlanets().get("Sun").get(0).intValue());

        Planet ephemerisModi = new PlanetBuilder(event)
                .planets()
                .build();
        System.out.println(ephemerisModi.getPlanets().get("Sun").get(0).intValue());
        System.out.println(LocalDateTime.of(2000, 1, 9, 0, 0));

        BirthChart birthChart = new BirthChart(City.generateCity(), BirthChart.generateBirthTime());
        System.out.println("------------------------");
        System.out.println(birthChart.getHousesPosition().getCusps().size());
        System.out.println(birthChart.getHousesPosition().getCusps());
        System.out.println(birthChart.getHousesPosition().getCusps().get(0).intValue());
        System.out.println(birthChart.getPlanetsPosition().getPlanets().get("Sun").get(0).intValue());
        System.out.println("------------------------------------------------------------------");
        System.out.println(ElementBalance.generateElementBalance(birthChart).getFireStr() + " fire");
        System.out.println(ElementBalance.generateElementBalance(birthChart).getAirStr() + " air");
        System.out.println(ElementBalance.generateElementBalance(birthChart).getEarthStr() + " earth");
        System.out.println(ElementBalance.generateElementBalance(birthChart).getWaterStr() + " water");
        System.out.println("------------------------------------------------------------------");

        // Arrays.asList("Sun", "Moon", "Mercury", "Venus", "Mars", "Chiron", "NNod", "Pluto", "Neptun", "Uran");
        String planet = "Uranus";
        int pos = birthChart.getPlanetsPosition().getPlanets().get(planet).get(0).intValue();
        System.out.println(pos);

        List<String> planetList =
                Arrays.asList("Sun", "Moon", "Mercury", "Venus", "Mars", "Pluto", "Neptune", "Uranus");
        for (int i = 0; i < planetList.size(); i++) {
            int position;
            String planetName = planetList.get(i);
            position = birthChart.getPlanetsPosition().getPlanets().get(planetName).get(0).intValue();
            System.out.println(i);
            System.out.println(position);

        }


    }
}
