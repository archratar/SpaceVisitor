package Builder;

import Ship.SpaceShip;

public interface TolyanBuilder {

    public SpaceShip buildStages(String stages);
    public SpaceShip buildCabin(String cabin);
    public SpaceShip buildEngine(String engine);
    public SpaceShip build(String engine, String cabin, String stages);
    public boolean shipIsReady();
}
