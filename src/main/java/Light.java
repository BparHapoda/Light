public class Light {
    private final Battery battery;
    private boolean light;

    public Light(Battery battery) {
        this.battery = battery;
    }

    public void on() {
        light = battery.charge();
    }


    public void off() {
        light = false;
    }

    public boolean isLight() {
        return light;
    }

}
