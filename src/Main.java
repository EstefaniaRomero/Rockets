import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Rocket> rockets = createRockets();
        printRockets(rockets);

    }

    private static void printRockets(List<Rocket> rockets) {

        for(int i = 0; i < rockets.size(); i++) {

            System.out.println("Codi del coet: " + rockets.get(i).getCode() + " - Número de propulsors: "
                                + rockets.get(i).getPropeller());
        }
    }

    private static List<Rocket> createRockets() {

        List<Rocket> rockets = new ArrayList<>();

        rockets.add(new Rocket("32WESSDS",3));
        rockets.add(new Rocket("LDSFJA32",6));

        return rockets;

    }
}
