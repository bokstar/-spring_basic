package javaEssential.ex38;

import java.util.Optional;

public class Axxc {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("자바이다닫");

        if (optional.isPresent()){
        System.out.println(optional.get());
        }

        Optional<String> optional1 = Optional.empty();
        System.out.println(optional1.orElse("빈 객체"));
        System.out.println(optional1.orElseGet(String::new));
    }
}
