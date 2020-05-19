package javaEssential.ex30;

import java.util.Objects;
import java.util.stream.IntStream;

public class Steam2 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(1,2,3,4,5,6,7,8,9,0);
        IntStream stream2 = IntStream.of(1,2,3,4,5,6,7,8,9,0);

        stream1.distinct().forEach(value -> System.out.println(value+" "));
        stream2.filter(n ->n%2 !=0).forEach(value -> System.out.println(value+" "));
    }
}
