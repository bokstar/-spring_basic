package javaEssential.ex29;

import java.util.Random;
import java.util.stream.IntStream;

public class Ess {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(4);
        intStream.forEach(System.out::println);
    }
}
