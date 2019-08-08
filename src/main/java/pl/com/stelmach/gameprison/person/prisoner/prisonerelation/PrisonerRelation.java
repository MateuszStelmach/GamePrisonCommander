package pl.com.stelmach.gameprison.person.prisoner.prisonerelation;

import lombok.Getter;
import pl.com.stelmach.gameprison.person.prisoner.PrisonerNumber;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Getter
public class PrisonerRelation {
    private Map<PrisonerNumber, Map<Relation, Integer>> prisonerRelations;

    PrisonerRelation(List<PrisonerNumber> prisonerNumberList) {
        prisonerRelations = new LinkedHashMap<>();
        Map<Relation, Integer> relation = new LinkedHashMap<>();
        for (PrisonerNumber prisonerNumber : prisonerNumberList) {
            for (Relation rel : Relation.values()) {
                relation.put(rel, 0);
            }
            prisonerRelations.put(prisonerNumber, relation);
        }
    }
}
