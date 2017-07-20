package Main;

import Builder.SpaceShipBuilder;
import Builder.TolyanBuilder;
import Ship.SpaceShip;

public class Main {
    public static void main(String[] args) {

        SpaceShip hyperion = new SpaceShip();
        TolyanBuilder tolyan = new SpaceShipBuilder(hyperion);

        String cabin = new String("Korobka");
        String engine = new String("Toyota");
        String stages = new String("Stremyanka");

        int value = 0;
        while (! tolyan.shipIsReady()) {

            value = (int)( Math.random() * 100 );

            switch (value) {
                case 10: tolyan.buildCabin(cabin); System.out.println(cabin);
                    break;
                case 30: tolyan.buildEngine(engine); System.out.println(engine);
                    break;
                case 50: tolyan.buildStages(stages); System.out.println(stages);
                    break;
                case 66: tolyan.build(engine, cabin, stages); System.out.println(engine + " " + cabin + " " + stages);
                    break;
                default: System.out.println("Leaver shot");
            }

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
