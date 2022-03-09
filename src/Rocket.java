import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String code;
    private List<Propeller> propellerList = new ArrayList<>();

    public Rocket(String code) throws Exception {
        checkCode(code);
        this.code = code;

    }

    private void checkCode(String code) throws Exception {
        if (code.equals("")) throw new Exception();

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public List<Propeller> getPropellerList() {
        return propellerList;
    }

    public void addPropeller(int power) throws Exception {

        Propeller propeller = new Propeller(power);

        propellerList.add(propeller);


    }

    public void speedUpPropeller() {


        for (Propeller currentPropeller : propellerList) {
            currentPropeller.speedUp();

        }

    }

    public void bakerPropeller() {


        for (Propeller currentPropeller : propellerList) {
            currentPropeller.brake();

        }


    }

    @Override
    public String toString() {
        return "Rocket{" +
                "code='" + code + '\'' + '\n' +
                ", propellerList=" + propellerList +
                "}\n";
    }


}
