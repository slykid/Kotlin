package com.example.slyki.hello;

public class Car
{
    private int currentSpeed = 0;
    private int maxSpeed = 100;
    private int acceleration = 3;
    private int brakeSpeed = 4;

    public Car(int currentSpeed, int maxSpeed, int brakeSpeed)
    {
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    public void accelerationPedal()
    {
        currentSpeed = currentSpeed + acceleration;
        if(currentSpeed > maxSpeed)
            currentSpeed = maxSpeed;
    }

    public void brakePedal()
    {
        currentSpeed = currentSpeed - brakeSpeed;
        if(currentSpeed < 0)
            currentSpeed = 0;
    }

    public String getCurrentSpeedText()
    {
        return "현재 속도는 " + this.currentSpeed + " km/h 입니다.";
    }
}
