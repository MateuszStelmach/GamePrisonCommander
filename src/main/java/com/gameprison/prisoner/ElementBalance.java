package com.gameprison.prisoner;

import com.gameprison.astrologyinfluance.BirthChart;
import com.gameprison.astrologyinfluance.PlanetList;
import lombok.Getter;
import lombok.Setter;

public class ElementBalance {

    private @Getter
    @Setter
    int fireStr;
    private @Getter
    @Setter
    int waterStr;
    private @Getter
    @Setter
    int airStr;
    private @Getter
    @Setter
    int earthStr;

    private ElementBalance(int fireStr, int waterStr, int airStr, int earthStr) {
        this.fireStr = fireStr;
        this.waterStr = waterStr;
        this.airStr = airStr;
        this.earthStr = earthStr;
    }

    public static ElementBalance generateElementBalance(BirthChart birthChart) {
         /*• Factor with a Light: +4 (each Light)
• Factor with Mercury, Venus, Mars, the ascendant or midheaven: +3 (each object)
• Factor with a sign on the 1st 4th  7th or 10th house
, +3, astral houses +2 mental +1 */
        int fStr = fireBalance(birthChart);
        int eStr = earthBalance(birthChart);
        int aStr = airBalance(birthChart);
        int wStr = waterBalance(birthChart);

        return new ElementBalance(fStr, eStr, aStr, wStr);
    }


    private static boolean isFirePosition(int position) {
        return ((position >= 0 && position < 30) || (position >= 90 && position < 120) || (position >= 240 && position < 270));

    }

    private static boolean isEarthPosition(int position) {
        return ((position >= 30 && position < 60) || (position >= 120 && position < 150) || (position >= 270 && position < 300));
    }

    private static boolean isAirPosition(int position) {
        return ((position >= 90 && position < 120) || (position >= 150 && position < 180) || (position >= 300 && position < 330));
    }

    private static boolean isWaterPosition(int position) {
        return ((position >= 120 && position < 150) || (position >= 180 && position < 210) || (position >= 330 && position < 360));
    }

    // Instead of name use enum HavenCelestial
    // elementStr -> fix name, it is not string, and name doesn't suggest anything
    // move this action to enum, and then you can remove this method and use it that way:
    //
    //
    // elementStr = name.addValue(elementStr) // fix name to reflect reasons and goals
    private static int buildElementStrengthbyPlanets(String name, int elementStr) {
        switch (name) {
            //"Sun", "Moon", "Mercury", "Venus", "Mars", "Pluto", "Neptune", "Uranus"
            case "Sun":
                elementStr = elementStr + 3;
                break;
            case "Moon":
                elementStr = elementStr + 3;
                break;
            case "Mercury":
                elementStr = elementStr + 2;
                break;
            case "Venus":
                elementStr = elementStr + 2;
                break;
            case "Mars":
                elementStr = elementStr + 2;
            case "Pluto":
                elementStr = elementStr + 1;
            case "Neptune":
                elementStr = elementStr + 1;
            case "Uranus":
                elementStr = elementStr + 1;


        }
        return elementStr;


    }

    private static int bulidElementStrengthbyHouses(int number, int elementStr) {
        switch (number) {
            case 0:
                elementStr += 3;
                break;
            case 1:
                elementStr += 2;
                break;
            case 2:
                elementStr += 1;
                break;
            case 3:
                elementStr += 3;
                break;
            case 4:
                elementStr += 2;
                break;
            case 5:
                elementStr += 1;
                break;
            case 6:
                elementStr += 3;
                break;
            case 7:
                elementStr += 2;
                break;
            case 8:
                elementStr += 1;
                break;
            case 9:
                elementStr += 3;
                break;
            case 10:
                elementStr += 2;
                break;
            case 11:
                elementStr += 1;
                break;
        }
        
        return elementStr;

    }

    private static int fireBalance(BirthChart birthChart) {
        int fireStr = 0;
        int position;
        // use for each loop for such cases
        /*
        for (String planet : PlanetList.planetList) {

        }*/

        for (int i = 0; i < PlanetList.planetList.size(); i++) {


            position = birthChart.getPlanetsPosition().getPlanets().get(PlanetList.planetList.get(i)).get(0).intValue(); // int Value not necessary
            if (isFirePosition(position)) {
                fireStr = buildElementStrengthbyPlanets(PlanetList.planetList.get(i), fireStr);
            }
        }
        // why j < 12 ?? Magic value, it depends from list size. use for each loop
        for (int j = 0; j < 12; j++) {

            position = birthChart.getHousesPosition().getCusps().get(j).intValue(); // intValue() not necessary
            if (isFirePosition(position)) {
                fireStr = bulidElementStrengthbyHouses(j, fireStr);
            }
        }
        return fireStr;
    }

    private static int earthBalance(BirthChart birthChart) {
        int earthStr = 0;
        int position;

        for (int i = 0; i < PlanetList.planetList.size(); i++) {

            position = birthChart.getPlanetsPosition().getPlanets().get(PlanetList.planetList.get(i)).get(0).intValue();
            if (isEarthPosition(position)) {
                earthStr = buildElementStrengthbyPlanets(PlanetList.planetList.get(i), earthStr);

            }
        }
        for (int j = 0; j < 12; j++) {
            position = birthChart.getHousesPosition().getCusps().get(j).intValue();
            if (isEarthPosition(position)) {
                earthStr = bulidElementStrengthbyHouses(j, earthStr);

            }
        }
        return earthStr;
    }

    private static int airBalance(BirthChart birthChart) {
        int airStr = 0;
        int position;


        for (int i = 0; i < PlanetList.planetList.size(); i++) {
            position = birthChart.getPlanetsPosition().getPlanets().get(PlanetList.planetList.get(i)).get(0).intValue();
            if (isAirPosition(position)) {
                airStr = buildElementStrengthbyPlanets(PlanetList.planetList.get(i), airStr);

            }
        }
        for (int j = 0; j < 12; j++) {
            position = birthChart.getHousesPosition().getCusps().get(j).intValue();
            if (isAirPosition(position)) {
                airStr = bulidElementStrengthbyHouses(j, airStr);

            }
        }
        return airStr;
    }

    private static int waterBalance(BirthChart birthChart) {
        int waterStr = 0;
        int position;

        for (int i = 0; i < PlanetList.planetList.size(); i++) {
            position = birthChart.getPlanetsPosition().getPlanets().get(PlanetList.planetList.get(i)).get(0).intValue();
            if (isWaterPosition(position)) {
                waterStr = buildElementStrengthbyPlanets(PlanetList.planetList.get(i), waterStr);
            }
        }
        for (int j = 0; j < 12; j++) {
            position = birthChart.getHousesPosition().getCusps().get(j).intValue();
            if (isWaterPosition(position)) {
                waterStr = bulidElementStrengthbyHouses(j, waterStr);

            }
        }
        return waterStr;
    }


}
