public class SpeedLights {

    private int speedLimit = 60;

    public SpeedLights (int speedLimit){
        this.speedLimit= speedLimit;
    }

    // нет превышения зеленый
    // есть превышение <=20 желтый
    //есть превышение >20 красный

    public String showLight(int currentSpeed){

        if (currentSpeed<=speedLimit){
            return "green";
        }
        else if (currentSpeed<=speedLimit+20)
            return  "yellow";

        else
            return "red";

    }


}
