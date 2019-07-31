package pl.com.stelmach.gameprison.person.prisoner;

import lombok.Setter;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.astrologyinfluance.City;
import pl.com.stelmach.gameprison.astrologyinfluance.GenerateData;
import lombok.Getter;
import pl.com.stelmach.gameprison.person.CharacterQualityBalance;
import pl.com.stelmach.gameprison.person.Personality;


@Getter
public class Prisoner {
    private final PrisonerNumber prisonNumber;

    private BirthChart birthChart;
    private City city;
    private Personality personality;
    @Setter
    private int prisonCellNumber;
    @Setter
    private CharacterQualityBalance characterQualityBalance;
    @Setter
    private PrisonerRelation prisonerRelation;
    @Setter
    private PrisonerStatus status;

    public Prisoner(int prisonNumber, int prisonCellNumber) {
        this.prisonCellNumber = prisonCellNumber;
        this.prisonNumber = new PrisonerNumber(prisonNumber);
        this.status = PrisonerStatus.REGULAR;
        this.city = GenerateData.generateCity();
        this.birthChart = new BirthChart(this.city, GenerateData.generateBirthTime());
    }


}

