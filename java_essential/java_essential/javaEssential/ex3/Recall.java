package javaEssential.ex3;

public class Recall {

    public static void main(String[] args) {

        int i = sum(4);
        System.out.println(i);


        int j = recuresiveSum(1);

        System.out.println(j);
    }

    static int sum(int i) {
        int result = 0;
        for (int s = 0; s < i; s++) {
            result = +s;
        }
        return result;
    }

    static int recuresiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recuresiveSum(n - 1);
    }
}
