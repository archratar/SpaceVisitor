package Ship;

public class SpaceShip {

    private Cabin cabin;
    private Engine engine;
    private Stages stages;

    public SpaceShip() {

    }

    public void setCabin(String cabin) {
        this.cabin = new Cabin(cabin);
    }

    public void setStages(String stages) {
        this.stages = new Stages(stages);
    }

    public void setEngine(String engine) {
        this.engine = new Engine(engine);
    }

    // getters
    public Engine getEngine() {

        return engine;
    }

    public Cabin getCabin() {

        return cabin;
    }

    public Stages getStages() {

        return stages;
    }


}
