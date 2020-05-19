package javaEssential.ex33;

import java.util.stream.IntStream;

public class SStrin {

    public static void main(String[] args) {
    IntStream stream1 = IntStream.range(0,10);
    IntStream stream2 = IntStream.range(0,10);
    IntStream stream3 = IntStream.range(0,10);

    stream1.skip(4).forEach(n -> System.out.println(n+" "));
        System.out.println();

    stream2.limit(5).forEach(n -> System.out.println(n+" "));
        System.out.println();

    stream3.skip(3).limit(5).forEach(n -> System.out.println(n+" "));

    }
}
