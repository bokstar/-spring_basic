package javaEssential.ex28;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        String[] strings = new String[]{"1","2","3","4"};

        Stream<String> stream = Arrays.stream(strings);
        stream.forEach(e -> System.out.println(e+" "));
        System.out.println();


        Stream<String> stream2 = Arrays.stream(strings,1,3);
        stream2.forEach(e -> System.out.print(e + " "));
    }
}
