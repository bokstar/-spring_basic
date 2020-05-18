package javaEssential.ex15;

public class TestClone {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModelName("아반떼");
        car1.setOwner("신재복");

        System.out.println(
                "car1:  "+ car1.getModelName()+"" +
                        ""+car1.getOwner());

//        Car car2 = (Car)car1.clone(
//        car2.setOwner("이순신");
    }
}
