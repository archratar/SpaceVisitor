package Builder;

import Ship.SpaceShip;


public class TolyanBuilder implements SpaceShipBuilder {

    private SpaceShip ship;

    public TolyanBuilder() {
        this.ship = new SpaceShip();
    }

    public TolyanBuilder(SpaceShip ship) {
        this.ship = ship;
    }

    public SpaceShip buildStages(String stages) {
        this.ship.setStages(stages);
        return this.ship;
    }

    public SpaceShip buildEngine(String engine) {
        this.ship.setEngine(engine);
        return this.ship;
    }

    public SpaceShip buildCabin(String cabin) {
        this.ship.setCabin(cabin);
        return this.ship;
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
