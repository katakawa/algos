package com.algos.bitmanipulation;

public class BinaryToString {

    public static void main(String[] args) {
        bin(56);
    }

    private static void bin(long n)
    {
        long i;
        System.out.print("0");
        for (i = 1 << 30; i > 0; i = i >> 1)
        {
            if ((n & i) != 0)
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("0");
            }
        }
    }
}
