package Builder;

import Ship.SpaceShip;

public interface SpaceShipBuilder {

    public TolyanBuilder buildStages(String stages);
    public TolyanBuilder buildCabin(String cabin);
    public TolyanBuilder buildEngine(String engine);
    public SpaceShip build(String engine, String cabin, String stages);
    public int leaverShot();
    public int getLeaverState();
    public boolean shipIsReady();
}
