package pl.com.stelmach.gameprison.person.prisoner.prisonerelation;

import lombok.Getter;
import pl.com.stelmach.gameprison.person.prisoner.PrisonerNumber;
import pl.com.stelmach.gameprison.person.prisoner.prisonerelation.Relation;

import java.util.Map;

@Getter
public class PrisonerRelation {
    private Map<PrisonerNumber, Map<Relation, Integer>> prisonerRelations;
}
