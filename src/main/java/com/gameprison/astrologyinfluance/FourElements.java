package com.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FourElements {
    FIRE("fire", "will"),
    AIR("air", "intellect"),
    WATER("water", "emotions"),
    EARTH("earth", "material");

    @Getter
    private final String quality;
    private final String name;

}
