package com.algos.bitmanipulation;

/**
 * 2 integers N and M
 * i and j positions
 * Insert M into N, j through i
 */
public class BitInsertion {

    public static void main(String[] args) {
        int n = 0b10000000000;
        int m = 0b10011;
        int res = insert(n, m, 6, 2);
        System.out.println("Result:");
        System.out.println(Integer.toBinaryString(res));
    }

    private static int insert(int n, int m, int j, int i) {
        //create mask from j till i
        int leftMask = -1 << j;
        System.out.println("leftMask:");
        System.out.println(Integer.toBinaryString(leftMask));

        int rightMask = (1 << (i + 1)) - 1;
        System.out.println("rightMask:");
        System.out.println(Integer.toBinaryString(rightMask));

        int shiftedM = m << i;
        System.out.println("shiftedM:");
        System.out.println(Integer.toBinaryString(shiftedM));

        int mask = leftMask | rightMask;
        System.out.println("mask:");
        System.out.println(Integer.toBinaryString(mask));

        int res = n & mask;
        res = res | shiftedM;
        return res;
    }
}
