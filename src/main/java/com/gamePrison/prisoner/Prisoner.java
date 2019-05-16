package com.gamePrison.prisoner;

import com.gamePrison.astrologyInfluance.BirthChart;
import com.gamePrison.astrologyInfluance.City;
import cz.kibo.api.astrology.domain.Coordinates;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Random;

public class Prisoner {
    private int prisonNumber;

    private enum STATUS {
        GRYPESER,
        FRAJER,
        CWEL
    }


    private @Getter
    BirthChart birthChart;
    private @Getter City city;
    private @Getter Personality personality;
    private @Getter PrisonerStat prisonerStat;
    private @Getter PrisonRelation prisonRelation;

    public Prisoner(int prisonNumber) {
        this.prisonNumber = prisonNumber;
        this.city = City.generateCity();
        this.birthChart = new BirthChart(this.city, BirthChart.generateBirthTime());
    }




}

