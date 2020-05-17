package com.thread.exam1;

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
        new Thread(new HelloRunnable()).start();
    }
}
