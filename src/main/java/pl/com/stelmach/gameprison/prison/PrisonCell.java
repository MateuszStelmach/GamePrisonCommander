package pl.com.stelmach.gameprison.prison;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.com.stelmach.gameprison.person.prisoner.Prisoner;

import java.util.Map;

@AllArgsConstructor
@Getter
public class PrisonCell {
    private final int serialNumber;
    private final int size;
    @Setter
    private Map<Integer, Prisoner> prisoners;


}
