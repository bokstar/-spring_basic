package javaEssential.ex27;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Exx {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Shin");
        strings.add("Jae");
        strings.add("Bok");
        strings.add("Lim");
        strings.add("Da");


        Stream<String> stream = strings.stream();
        stream.forEach(System.out::println);

    }
}
