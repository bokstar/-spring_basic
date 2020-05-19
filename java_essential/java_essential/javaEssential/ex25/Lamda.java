package javaEssential.ex25;

public class Lamda {


    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("전통적인 방법 입니다.");
            }
        }).start();

        new Thread(
                () -> {
                    System.out.println("람다식을 이용한 방법 입니다.");
                }
        ).start();

    }
}
