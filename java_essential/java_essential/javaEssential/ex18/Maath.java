package javaEssential.ex18;

import java.util.ArrayList;
import java.util.List;

public class Maath {

    static double randomNumber;
    static int j;

    void randomNum() {
        randomNumber = (double) Math.random();
    }

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(12312);
        num.add(42311122);
        num.add(123212);
        num.add(1232);
        num.add(123152);
        num.add(123162);

        for (int i : num) {
            j = Math.max(i, i - 1);

        }
        System.out.println(j);

        Maath maath = new Maath();
        maath.randomNum();
        System.out.println(randomNumber);

    }
}
