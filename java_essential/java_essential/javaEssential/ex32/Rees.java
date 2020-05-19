package javaEssential.ex32;

import java.util.Arrays;
import java.util.stream.Stream;

public class Rees {
    public static void main(String[] args) {
        String[] strings = {"Java","Is","Enng"};
        Stream<String> stream = Arrays.stream(strings);
        stream.flatMap(s -> Stream.of(s.split(" +      "))).forEach(System.out::println);
    }
}
