package Builder;

import Ship.SpaceShip;


public class SpaceShipBuilder implements TolyanBuilder {

    private SpaceShip ship;

    public SpaceShipBuilder() {
        this.ship = new SpaceShip();
    }

    public SpaceShipBuilder(SpaceShip ship) {
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

        int allDetails = 0;

        allDetails += this.ship.getCabin().getCabin() == null ? 0: 1;
        allDetails += this.ship.getStages().getStages() == null ? 0: 1;
        allDetails += this.ship.getEngine().getEngine() == null ? 0: 1;

        return allDetails == 3;
    }
}
