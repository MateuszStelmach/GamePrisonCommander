package pl.com.stelmach.gameprison.person.prisoner;

import lombok.Setter;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.astrologyinfluance.City;
import pl.com.stelmach.gameprison.astrologyinfluance.GenerateData;
import lombok.Getter;
import pl.com.stelmach.gameprison.person.Personality;

@Getter
public class Prisoner {
    private final int prisonNumber;

    private enum STATUS {
        GRYPESER,
        FRAJER,
        CWEL
    }


    private BirthChart birthChart;
    private City city;
    private Personality personality;
    @Setter
    private PrisonerStat prisonerStat;
    @Setter
    private PrisonerRelation prisonerRelation;

    public Prisoner(int prisonNumber) {
        this.prisonNumber = prisonNumber;
        this.city = GenerateData.generateCity();
        this.birthChart = new BirthChart(this.city, GenerateData.generateBirthTime());
    }


}

