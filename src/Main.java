import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Rocket> rockets = createRockets();
        initPropellers(rockets);
        printRockets(rockets);
        acceleratePropellerThreeTimes(rockets);
        bakePropellerFiveTimes(rockets);
        acceleratePropellerSevenTimesSecondRocket(rockets);
        acceleratePropellerFifteenTimes(rockets);
    }

    private static void acceleratePropellerFifteenTimes(List<Rocket> rockets) {
        System.out.println("Accelerar els coets 32WESSDS i LDSFJA32 15 cops:  ");
        System.out.println("---------------------------" + '\n');

        for (int i = 0; i < 15 ; i++) {

            rockets.get(0).speedUpPropeller();
            System.out.println(rockets.get(0));
            rockets.get(1).speedUpPropeller();
            System.out.println(rockets.get(1));
        }
    }

    private static void acceleratePropellerSevenTimesSecondRocket(List<Rocket> rockets) {
        System.out.println("Accelerar el coet LDSFJA32 7 vegades:  ");
        System.out.println("---------------------------" + '\n');

        for (int i = 0; i < 7 ; i++) {

            rockets.get(1).speedUpPropeller();
            System.out.println(rockets.get(1));
        }
    }

    private static void bakePropellerFiveTimes(List<Rocket> rockets) {
        System.out.println("Frenar 5 cops el coet 32WESSDS ");
        System.out.println("---------------------------" + '\n');
        for (int i = 0; i < 5 ; i++) {

            rockets.get(0).bakerPropeller();
            System.out.println(rockets.get(0));
        }
    }

    private static void acceleratePropellerThreeTimes(List<Rocket> rockets) {
        System.out.println("Accelerar els coets 32WESSDS i LDSFJA32 3  cops:  ");
        System.out.println("---------------------------" + '\n');

        for (int i = 0; i < 3 ; i++) {

            rockets.get(0).speedUpPropeller();
            System.out.println(rockets.get(0));
            rockets.get(1).speedUpPropeller();
            System.out.println(rockets.get(1));
        }
    }

    private static void initPropellers(List<Rocket> rockets) throws Exception {

        int [] powersRocket1 = {10,30,80};
        int [] powersRocket2 = {30,40,50,50,30,10};

        addPropellersToRocket(rockets.get(0),powersRocket1);
        addPropellersToRocket(rockets.get(1),powersRocket2);
    }

    private static void printRockets(List<Rocket> rockets) {

        System.out.println('\n' + "Codi dels coets i la seva potència máxima: ");
        System.out.println("----------------------------------------------");

        for(int i = 0; i < rockets.size(); i++) {

            System.out.println(" * Codi del coet: " + rockets.get(i).getCode() + '\n'
                    + "* Potència de cada propulsor: " + '\n'+ "---------------------" + '\n' + rockets.get(i).getPropellerList());
        }
    }

    private static List<Rocket> createRockets() throws Exception {

        List<Rocket> rockets = new ArrayList<>();
        Rocket rocket1 = new Rocket("32WESSDS");
        Rocket rocket2 = new Rocket("LDSFJA32");

        rockets.add(rocket1);
        rockets.add(rocket2);

        return rockets;
    }

    private static void addPropellersToRocket(Rocket rocket, int[] powersRocket) throws Exception {

        for (int i = 0; i < powersRocket.length ; i++) {
            rocket.addPropeller(powersRocket[i]);

        }
    }
}
