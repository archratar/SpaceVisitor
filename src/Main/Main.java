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
        int statusOfTolyan = tolyan.getLeaverState();

        while (! tolyan.shipIsReady()) {

            if (statusOfTolyan < 1) {
                System.out.println("Your Tolyan is dead");
                System.exit(statusOfTolyan);
            }

            value = (int)( Math.random() * 100 );

            System.out.println("Your roll is " + value + " , ");
            switch (value) {
                case 10: tolyan.buildCabin(cabin); System.out.println(cabin);
                    break;
                case 30: tolyan.buildEngine(engine); System.out.println(engine);
                    break;
                case 50: tolyan.buildStages(stages); System.out.println(stages);
                    break;
                case 66: tolyan.buildStages(stages).buildCabin(cabin).buildEngine(engine); System.out.println(engine + " " + cabin + " " + stages);
                    break;
                default:  tolyan.leaverShot(); statusOfTolyan--;
            }

//            System.out.println("Your builder is on " + tolyan.getLeaverState() + " leaver level");

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
