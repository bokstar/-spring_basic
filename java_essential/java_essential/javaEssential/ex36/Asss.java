package javaEssential.ex36;

import java.util.stream.Stream;

public class Asss {

    public static void main(String[] args) {
    Stream<String> stringStream = Stream.of("넷","하나","둘");
    stringStream.forEach(System.out::println);
    }
}
