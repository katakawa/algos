package com.algos.bitmanipulation;

public class BinaryToString {

    public static void main(String[] args) {
        bin(1);
    }

    private static String binaryToString(double num) {

        return "";
    }

    static void bin(long n)
    {
        long i;
        System.out.print("0");
        for (i = 1 << 30; i > 0; i = i / 2)
        {
            if((n & i) != 0)
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
