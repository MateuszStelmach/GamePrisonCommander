package pl.com.stelmach.gameprison.prisoner;


import pl.com.stelmach.gameprison.astrologyinfluance.Houses;
import lombok.Getter;

import java.util.Map;

@Getter
public class HouseBalance {

    private Map<Houses, Integer> houseBalance;
}
