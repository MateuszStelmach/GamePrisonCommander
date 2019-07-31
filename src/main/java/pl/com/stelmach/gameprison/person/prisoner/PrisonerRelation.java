package pl.com.stelmach.gameprison.person.prisoner;

import lombok.Getter;

import java.util.Map;

@Getter
public class PrisonerRelation {
    private Map<PrisonerNumber, Map<PrisonerRelation, Integer>> prisonerRelKation;
}
