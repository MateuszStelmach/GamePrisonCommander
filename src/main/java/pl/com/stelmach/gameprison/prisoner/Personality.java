package pl.com.stelmach.gameprison.prisoner;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Personality {
    private ElementBalance elementBalance;
    private HouseBalance houseBalance;
    private PlanetBalance planetBalance;


}
