public abstract class Battery {
    private int charge;


    public void setCharge(int charge) {
        this.charge = charge;
    }

    public boolean charge() {
        charge--;
        if (charge <= 0) {
            System.out.println("Батарейка разряжена");
        }
        return charge > 0;
    }

    public int getCharge() {
        return charge;
    }
}
