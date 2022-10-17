import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SpeedLightParamsTest {


    private int speedLimit;
    private int currentSpeed;
    private String expectedLight;

    public SpeedLightParamsTest(int speedLimit, int  currentSpeed, String expectedLight){
        this.speedLimit = speedLimit;
        this.currentSpeed=currentSpeed;
        this.expectedLight=expectedLight;
    }

    @Parameterized.Parameters(name="limit={0}, speed ={1}, light={2}")
    public static Object[] dataGen(){
        return new Object[][]{
                {60,50,"green"},
                {60,60,"green"},
                {60,70,"yellow"},
                {60,90,"red"},
        };
    }

    @Test
    public void showLightCheked(){
        SpeedLights lights = new SpeedLights(speedLimit);
        String value = lights.showLight(currentSpeed);
        assertEquals(expectedLight, value);
    }



}
