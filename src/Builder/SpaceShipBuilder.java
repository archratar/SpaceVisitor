package Builder;

import Ship.SpaceShip;

public interface SpaceShipBuilder {

    public SpaceShip buildStages(String stages);
    public SpaceShip buildCabin(String cabin);
    public SpaceShip buildEngine(String engine);
    public SpaceShip build(String engine, String cabin, String stages);
    public boolean shipIsReady();
}
