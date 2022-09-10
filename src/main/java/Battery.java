public abstract class Battery {
    private int charge;


    public void setCharge(int charge) {
        this.charge = charge;
    }

    public boolean charge (){
        charge--;
        return charge > 0;
    }
}
