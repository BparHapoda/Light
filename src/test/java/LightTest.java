import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LightTest {

    @Test
    public void isLightForNewLightShouldBeFalse(){
        Light light = new Light(new ChinaBattery());
        Assertions.assertFalse(light.isLight());
    }
    @Test
    public void isLightLaterOnShouldBeTrue(){
        Light light = new Light(new ChinaBattery());

        light.on();
        Assertions.assertTrue(light.isLight());
    }
    @Test
    public void isLightLaterOffShouldBeFalse(){
        Light light = new Light(new ChinaBattery());

        light.off();
        Assertions.assertFalse(light.isLight());
    }

    @Test
    public void LightShouldBeOffAfterFifthOn(){
        Light light = new Light(new ChinaBattery());

        light.on();
        light.on();light.on();light.on();light.on();light.on();

        Assertions.assertFalse(light.isLight());
    }

}