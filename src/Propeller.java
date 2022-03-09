public class Propeller {

    private int power;
    private int actualPower = 0;
    private static final int INCREMENT_POWER = 10;


    public Propeller(int power) throws Exception {
        checkPowerPropeller(power);

        this.power = power;
    }

    private void checkPowerPropeller(int power) throws Exception {
        if(power < 0) throw new Exception("La potencia no pot ser menor que 0!");

    }

    public int getPower() {
        return power;
    }

    public int getActualPower() {
        return actualPower;
    }


    public void speedUp(){

        actualPower+= INCREMENT_POWER;
        if(actualPower > power){
            actualPower = power;
        }
    }

    public void brake(){

        actualPower-= INCREMENT_POWER;
        if(actualPower < 0){

            actualPower = 0;
        }
    }

    @Override
    public String toString() {
        return "Propeller{" +
                "power=" + power + "," +
                "actualPower=" + actualPower +
                "}\n";
    }


}

