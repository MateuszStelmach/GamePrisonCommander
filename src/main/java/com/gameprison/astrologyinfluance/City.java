package com.gameprison.astrologyinfluance;

import cz.kibo.api.astrology.domain.Coordinates;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
public class City {

    private String cityName;
    private Coordinates coordinates;

    // moce to some utils class, it doesn't fit to bean class

}
