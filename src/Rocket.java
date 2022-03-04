public class Rocket {

    private String code;
    private int propeller;

    public Rocket(String code, int propeller) {
        this.code = code;
        this.propeller = propeller;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPropeller() {
        return propeller;
    }

    public void setPropeller(int propeller) {
        this.propeller = propeller;
    }
}
