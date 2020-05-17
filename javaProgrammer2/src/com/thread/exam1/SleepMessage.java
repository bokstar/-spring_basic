package com.thread.exam1;

public class SleepMessage {

    public static void main(String[] args) throws InterruptedException {

        String importantInfo[] = { "Mares eat oats", "Does eat oats", "Little lambs eat ivy",
                "A kid will eat ivy too" };

        for (String s:importantInfo){

            try {
            Thread.sleep(4000);
            }catch (InterruptedException ie){
                return;
            }

            System.out.println(s);
        }

    }
}
