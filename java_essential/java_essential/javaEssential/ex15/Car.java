package javaEssential.ex15;

import java.util.ArrayList;

public class Car implements Cloneable {

    private String modelName;
    private String owner;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();
        return clonedCar;
    }
}
