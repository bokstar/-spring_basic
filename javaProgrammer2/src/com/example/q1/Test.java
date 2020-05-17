package com.example.q1;


public class Test {

    public static void main(String[] args) {

        final Counter obj1 = new Counter();
        final Counter obj2 = new Counter();

        // Thread에 대한 이해 Runnable?
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj1.display(obj2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj2.display(obj1);
            }
        }).start();
    }
}
