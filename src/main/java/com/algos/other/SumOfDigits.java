package com.algos.other;

public class SumOfDigits {

    public static void main(String[] args) {
        sumDigits(1_990_560);
    }

    private static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
