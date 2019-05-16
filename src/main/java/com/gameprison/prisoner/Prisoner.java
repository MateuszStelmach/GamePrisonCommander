package com.gameprison.prisoner;

import com.gameprison.astrologyinfluance.BirthChart;
import com.gameprison.astrologyinfluance.City;
import lombok.Getter;

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

