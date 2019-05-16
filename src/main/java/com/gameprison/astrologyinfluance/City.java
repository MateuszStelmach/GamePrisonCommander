package com.gameprison.astrologyinfluance;

import cz.kibo.api.astrology.domain.Coordinates;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

// annotations on class level
public class City {
    private @Getter
    @Setter
    String cityName;
    private @Getter
    @Setter
    Coordinates coordinates;

    // not necessary
    public City() {
    }

    public City(String name, Coordinates coordinates) {
        this.cityName = name;
        this.coordinates = coordinates;

    }

    // moce to some utils class, it doesn't fit to bean class
    public static City generateCity() {
        String cityName = cityName();
        double geoalt = 173; // avg for Poland
        Random random = new Random();

        double latitude = 49 + random.nextInt(6);// latitude for Poland 49-54 N
        double longitude = 14 + random.nextInt(11);//longitude for Poland 14-24E
        return new City(cityName, new Coordinates(longitude, latitude, geoalt));


    }

    private static String cityName() {
        String cityName = "";
        Random random = new Random();
        int a = random.nextInt(3);
        if (a == 0) cityName = "Big city";
        if (a == 1) cityName = "Small city";
        if (a == 2) cityName = "Country area";
        return cityName;
    }
}
