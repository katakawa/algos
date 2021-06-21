package com.algos.bitmanipulation;

public class Conversion {

    public static void main(String[] args) {

    }

    int bitSwapRequired(int a, int b) {
        int count = 0;
        for (int c = a ^ b; c != 0; c >>= 1) {
            count += c & 1;
        }

        return count;
    }

}
