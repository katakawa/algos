package com.algos.recursion;

public class PowersOfTwo {

    public static void main(String[] args) {
        powers0fTwo(256);
    }

    private static int powers0fTwo(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            System.out.println(1);
            return 1;
        } else {
            int prev = powers0fTwo(n / 2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }

}
