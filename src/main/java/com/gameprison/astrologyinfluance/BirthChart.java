package com.gameprison.astrologyinfluance;

import cz.kibo.api.astrology.builder.CuspBuilder;
import cz.kibo.api.astrology.builder.PlanetBuilder;
import cz.kibo.api.astrology.domain.Cusp;
import cz.kibo.api.astrology.domain.Planet;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;


@Getter
@Setter
public class BirthChart {
    private City city;
    private LocalDateTime birthTime;
    private Planet planetsPosition;
    private Cusp housesPosition;

    public BirthChart(City city, LocalDateTime birthTime) {

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

    public int getPlanetPositionInt(String planetName) {
        return this.getPlanetsPosition().getPlanets().get(planetName).get(0).intValue();
    }

    public int getHousePositionInt(int positionNumber) {
        return this.getHousesPosition().getCusps().get(positionNumber).intValue();
    }
}
