package javaEssential.ex2;


public class Car {
    private String speed;
    private String model;
    private String color;
    private String right;

    public Car() {
        this("sdf", "erw", "qfaf", "asfsf");
    }

    public Car(String color) {
        this.color = color;
    }

    void dispaly() {
    }

    void dispaly(int i) {
        System.out.println(i);
    }

    void dispaly(int i, int j) {
        System.out.println(i + j);
    }

    void dispaly(String s) {
        System.out.println(s);
    }


    public Car(String speed, String model, String color, String right) {
        this.speed = speed;
        this.model = model;
        this.color = color;
        this.right = right;
    }

    void init() {
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }
}
