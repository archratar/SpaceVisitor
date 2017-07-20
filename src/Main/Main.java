package Main;

import Builder.TolyanBuilder;
import Builder.SpaceShipBuilder;
import Ship.SpaceShip;

public class Main {
    public static void main(String[] args) {

        SpaceShip hyperion = new SpaceShip();
        SpaceShipBuilder tolyan = new TolyanBuilder(hyperion);

        String cabin = new String("Korobka cabin");
        String engine = new String("Toyota engine");
        String stages = new String("Stremyanka stages");

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
                case 66: tolyan.buildStages(stages).buildCabin(cabin).buildEngine(engine); System.out.println(engine + " " + cabin + " " + stages);
                    break;
                default: System.out.println("Leaver shot");
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
