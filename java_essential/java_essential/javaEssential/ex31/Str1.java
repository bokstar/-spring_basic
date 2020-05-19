package javaEssential.ex31;

import java.util.stream.Stream;

public class Str1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java","Is","Good","Leng");
        stream.forEach(System.out::println);
    }
}
