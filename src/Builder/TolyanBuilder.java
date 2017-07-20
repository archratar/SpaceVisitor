package Builder;

import Ship.SpaceShip;


public class TolyanBuilder implements SpaceShipBuilder {

    private SpaceShip ship;
    private int leaverLevel = 100;

    public TolyanBuilder() {
        this.ship = new SpaceShip();
    }

    public TolyanBuilder(SpaceShip ship) {
        this.ship = ship;
    }

    public int leaverShot() {
        this.leaverLevel--;
        return this.leaverLevel;
    }

    public int getLeaverState() {
        return this.leaverLevel;
    }

    public TolyanBuilder buildStages(String stages) {
        this.ship.setStages(stages);
        return this;
    }

    public TolyanBuilder buildEngine(String engine) {
        this.ship.setEngine(engine);
        return this;
    }

    public TolyanBuilder buildCabin(String cabin) {
        this.ship.setCabin(cabin);
        return this;
    }

    public SpaceShip build(String engine, String cabin, String stages) {
        buildCabin(cabin);
        buildStages(stages);
        buildEngine(engine);

        return this.ship;
    }

    public boolean shipIsReady() {

        if (
            (this.ship.getCabin() != null)
        &&  (this.ship.getEngine() != null)
        &&  (this.ship.getStages() != null) ) {
            return true;
        }

        return false;
    }
}
