package com.thread.exam1;


public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("HelloThread");
    }

    public static void main(String[] args) {

        new HelloThread().start();
    }

}
