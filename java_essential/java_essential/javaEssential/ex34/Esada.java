package javaEssential.ex34;

import java.util.Comparator;
import java.util.stream.Stream;

public class Esada {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Java","HTML","Javascript");
        Stream<String> stream2 = Stream.of("Java","HTML","Javascript");

        stream1.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s+" "));
    }
}
