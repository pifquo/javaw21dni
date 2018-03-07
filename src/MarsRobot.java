public class MarsRobot
{
    String status;
    int speed;
    float temperature;

    void chechTemperature()
    {
        if (temperature < -62)
        {
            status = "pwrót do domu";
            speed = 5;

        }
    }

    void showAttributes()
    {
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }


}
