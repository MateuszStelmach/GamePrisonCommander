package pl.com.stelmach.gameprison.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.com.stelmach.gameprison.astrologyinfluance.ElementBalance;
import pl.com.stelmach.gameprison.astrologyinfluance.HeavenCelestialBalance;
import pl.com.stelmach.gameprison.astrologyinfluance.HouseBalance;

@Getter
@AllArgsConstructor
public class Personality {
    private ElementBalance elementBalance;
    private HouseBalance houseBalance;
    private HeavenCelestialBalance heavenCelestialBalance;

}
