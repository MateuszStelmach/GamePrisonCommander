package pl.com.stelmach.gameprison.prisoner;

import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.astrologyinfluance.City;
import pl.com.stelmach.gameprison.astrologyinfluance.GenerateData;
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
        this.city = GenerateData.generateCity();
        this.birthChart = new BirthChart(this.city, GenerateData.generateBirthTime());
    }




}

