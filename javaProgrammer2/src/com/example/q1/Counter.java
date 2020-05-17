package com.example.q1;
                        // Thread 클래스 알아보기
public class Counter extends Thread {
    int i = 5;

    // synchronized 란 무엇?
    public synchronized void display(Counter obj){

        try {
            Thread.sleep(5);
            obj.increment(this);
            System.out.println(i);
                // interruptedException 이란?
        }catch (InterruptedException ie){ }
    }
    public synchronized void increment (Counter obj){

    }


}
