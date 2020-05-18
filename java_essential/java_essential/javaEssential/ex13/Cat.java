package javaEssential.ex13;

public class Cat implements Animal, Pet {
    @Override
    public void cry() {
        System.out.println("야야얌아ㅏㄹ");
    }

    @Override
    public void play() {

        System.out.println("고양이 shfwk");
    }
}
