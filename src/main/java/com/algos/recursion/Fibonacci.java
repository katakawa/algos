package com.algos.recursion;

/**
 * In mathematics, the Fibonacci numbers, commonly denoted Fn, form a sequence,
 * called the Fibonacci sequence, such that each number is the sum of the two
 * preceding ones, starting from 0 and 1
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    static int count = 2;

    /**
     * Calculate Fibonacci
     * Stores temp value
     * @param previous
     * @param previousSum
     */
    private static void calcFibTillN(int previous, int previousSum) {
        if (count == 10) {
            System.out.println(previousSum);
            return;
        }
        int sum = previous + previousSum;
        count++;
        calcFibTillN(previousSum, sum);
    }

    /**
     * Each next call will span x2
     * Store value in the stack
     * comlexity is 2^N
     * Two previous Fibonacci's are calculated
     * @param n
     * @return
     */
    private static int fib(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * Calculate and store
     * @param n
     * @return
     */
    private static int[] calculateAllFibonacci(int n) {
        int[] nums = new int[15];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i < n; i++) {
            nums[i] = nums[i - 2] + nums [i - 1];
        }
        return nums;
    }


    //************************************************************************************************************

    /**
     * Top Down
     * @param n
     * @return
     */
    int fibonacciTopDown(int n) {
        return fibonacciTopDown(n, new int[n + 1]);
    }

    int fibonacciTopDown(int i, int[] memo) {
        if (i == 0 || i == 1) return i;

        if (memo[i] == 0) {
            memo[i] = fibonacciTopDown(i - 1, memo) + fibonacciTopDown(i - 2, memo);
        }

        return memo[i];
    }

    //************************************************************************************************************

    /**
     * Bottom Up
     * @param n
     * @return
     */
    int fibonacciBottomUp(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;

        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;

        for (int i= 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1] + memo[n - 2];
    }
}
