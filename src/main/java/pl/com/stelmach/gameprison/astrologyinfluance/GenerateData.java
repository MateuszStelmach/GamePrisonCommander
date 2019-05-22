package pl.com.stelmach.gameprison.astrologyinfluance;

import cz.kibo.api.astrology.domain.Coordinates;

import java.time.LocalDateTime;
import java.util.Random;

public class GenerateData {
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
