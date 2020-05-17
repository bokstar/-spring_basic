package javaEssential.ex1;

public class Car {
    private int currentSpeed;
    private int accelerationTime;

    public Car(int currentSpeed, int accelerationTime) {
        this.currentSpeed = currentSpeed;
        this.accelerationTime = accelerationTime;
    }

    @Override
    public String toString() {
        return "Car{" +
                "currentSpeed=" + currentSpeed +
                ", accelerationTime=" + accelerationTime +
                '}';
    }
}
