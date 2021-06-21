package com.algos.bitmanipulation;

public class BitManipulation {

    public static void main(String[] args) {
        int a = 0b0010;
        System.out.println(getBit(a, 1));
        System.out.println(getBit(a, 0));
        System.out.println(getBit(a, 2));
        System.out.println("*****");

    }

    static boolean getBit(int num, int position) {
        int mask = 1 << position;
        return (num & mask) != 0;
    }

    static int setBitToOne(int num, int i) {
        return num | 1 << i;
    }

    static int clearBit(int num, int position) {
        int mask = ~(1 << position);
        return num & mask;
    }

    static int clearBitsMsbThroughPosition(int num, int position) {
        int mask = (1 << position) - 1;
        return num & mask;
    }

    static int clearBitsPositionThrough0(int num, int position) {
        int mask = (-1 << (position + 1));
        return num & mask;
    }
}
