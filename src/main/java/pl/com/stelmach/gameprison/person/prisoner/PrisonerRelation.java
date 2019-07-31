package pl.com.stelmach.gameprison.person.prisoner;

import lombok.Getter;

import java.util.Map;

@Getter
public class PrisonerRelation {
    private Map<Integer, Map<PrisonerRelation, Integer>> prisonerRelation;
}
