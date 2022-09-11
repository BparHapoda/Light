public class Light {
    private final Battery battery;
    private boolean light;

    public Light(Battery battery) {
        this.battery = battery;
    }

    public void on() {
        System.out.println("Фонарик включен");
        light = battery.charge();
    }


    public void off() {
        System.out.println("Фонарик выключен");
        light = false;
    }

    public boolean isLight() {
        return light;
    }

    public Battery getBattery() {
        return battery;
    }
}
