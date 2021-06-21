package com.algos.recursion;

/**
 * Recursive functions use something called “the call stack.”
 * When a program calls a function, that function goes on top of the call stack.
 */
public class BasicRecursion {

    public static void main(String[] args) {
        //System.out.println(sum(5));
        printUnorderedPairs(new int[] { 1, 2, 3, 4, 5});

    }

    /**
     * Time complexity O(N)
     * Space complexity O(N)
     * @param n
     * @return
     */
    private static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    //************************************************************

    static int temp = 0;

    /**
     * Time complexity O(N)
     * Space complexity O(1)
     * @param n
     * @return
     */
    private static int sum1(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    private static int pairSum(int a, int b) {
        return a + b;
    }

    //*************************************************************

    private static void printUnorderedPairs(int[] array) {
        for (int i= 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
}
