package javaEssential.ex5;

public class DoorTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.doorOpen();
        System.out.println(car.door);
        car.toggleDoor();
        System.out.println(car.door);

    }
}
