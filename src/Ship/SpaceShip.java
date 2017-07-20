package Ship;

public class SpaceShip {

    private Cabin cabin;
    private Engine engine;
    private Stages stages;

    public SpaceShip() {

    }

    public Cabin getCabin() {

        return cabin;
    }

    public void setCabin(String cabin) {

        this.cabin.setCabin(cabin);
    }

    public Engine getEngine() {

        return engine;
    }

    public void setEngine(String engine) {

        this.engine.setEngine(engine);
    }

    public Stages getStages() {

        return stages;
    }

    public void setStages(String stages) {

        this.stages.setStages(stages);
    }
}
