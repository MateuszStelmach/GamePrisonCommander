package com.gamePrison.astrologyInfluance;

import cz.kibo.api.astrology.builder.CuspBuilder;
import cz.kibo.api.astrology.builder.PlanetBuilder;
import cz.kibo.api.astrology.domain.Cusp;
import cz.kibo.api.astrology.domain.Planet;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class BirthChart {
    private @Getter
    @Setter
    City city;
    private @Getter
    @Setter
    LocalDateTime birthTime;
    private @Getter
    @Setter
    Planet planetsPosition;
    private @Getter
    @Setter
    Cusp housesPosition;

    public BirthChart() {
    }

    public BirthChart(City city, LocalDateTime birthTime) {
        List<String> planetList =
                Arrays.asList("Sun", "Moon", "Mercury", "Venus", "Mars", "Pluto", "Neptune", "Uranus");
        this.city = city;
        this.birthTime = birthTime;
        this.planetsPosition = new PlanetBuilder(birthTime)
                .planets()
                .build();


        this.housesPosition =
                new CuspBuilder(birthTime)
                        .topo(city.getCoordinates().getLongitude(), city.getCoordinates().getLatitude(), city.getCoordinates().getGeoalt())
                        .build();

    }


    public static LocalDateTime generateBirthTime() {
        int year;
        int month;
        int day;
        int hour;
        int minutes;
        Random random = new Random();
        year = LocalDateTime.now().getYear() - random.nextInt(63) - 18;//prisoner age must be 18-80
        month = 1 + random.nextInt(12);
        day = 1 + random.nextInt(28); //becouse Feb is 28 days - no need for more birthcharts
        hour = random.nextInt(24);
        minutes = random.nextInt(60);

        return LocalDateTime.of(year, month, day, hour, minutes);

    }
}
