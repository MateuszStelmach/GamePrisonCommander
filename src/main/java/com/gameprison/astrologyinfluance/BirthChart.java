package com.gameprison.astrologyinfluance;

import cz.kibo.api.astrology.builder.CuspBuilder;
import cz.kibo.api.astrology.builder.PlanetBuilder;
import cz.kibo.api.astrology.domain.Cusp;
import cz.kibo.api.astrology.domain.Planet;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


// As all fields should be accessible, this annotation can be placed on class level, instead on field one
// You may also use @Data annotation
//@Getter
//@Setter
public class BirthChart {
    // better add annotation in this place
    @Getter
    @Setter
    private City city;
    private @Getter
    @Setter
    LocalDateTime birthTime;
    private @Getter
    @Setter
    Planet planetsPosition;
    private @Getter
    @Setter
    Cusp housesPosition;

    // not necessary - as it is single constructor
    public BirthChart() {
    }

    public BirthChart(City city, LocalDateTime birthTime) {
        // list not used
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


    // This doesn't fit to this class - create some util class
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
