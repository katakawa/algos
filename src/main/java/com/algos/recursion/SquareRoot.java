package com.algos.recursion;

public class SquareRoot {

    public static void main(String[] args) {
        sqrt(900);
    }

    private static int sqrt(int n) {
        return sqrt_helper(n, 1, n);
    }

    private static int sqrt_helper(int n, int min, int max) {
        System.out.println("--");
        System.out.println(min);
        System.out.println(max);
        System.out.println("--");

        if (max < min) {
            return -1;
        }

        int guess = (min + max) / 2;

        if (guess * guess == n) {
            return guess;
        } else if (guess * guess < n) {
            return sqrt_helper(n, guess + 1, max);
        } else {
            return sqrt_helper(n, min, guess - 1);
        }
    }

}
