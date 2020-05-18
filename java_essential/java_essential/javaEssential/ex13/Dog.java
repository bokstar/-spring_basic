package javaEssential.ex13;

public class Dog implements Animal, Pet {
    @Override
    public void cry() {

        System.out.println("멍멍");
    }

    @Override
    public void play() {

        System.out.println("놀자 멍머어머엄");
    }
}
