package javaEssential.ex24;

public class Thread01 {
    public static void main(String[] args) {
        ThreadWithClass thread1 = new ThreadWithClass();
        Thread thread2  = new Thread(new RunableWithClass());

        thread1.run();
        thread2.run();
    }

}
