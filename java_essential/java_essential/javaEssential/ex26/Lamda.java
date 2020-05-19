package javaEssential.ex26;

public class Lamda {
    public static void main(String[] args) {
        Calc calc = ((x, y) -> x<y?x:y);
        System.out.println(calc.min(3,4));
    }
}
