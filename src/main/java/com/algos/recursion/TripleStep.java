package com.algos.recursion;

import java.util.Arrays;

public class TripleStep {

    static int[] memo = new int[1000];

    public static void main(String[] args) {
        Arrays.fill(memo, -1);
        System.out.println(countStepsMemo(38));
        System.out.println(countSteps(38));
    }

    public static int countSteps(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return countSteps(n - 1) + countSteps(n - 2) + 1;
        }

        return countSteps(n - 3) + countSteps(n - 2) + countSteps(n - 1);
    }

    public static int countStepsMemo(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return countStepsMemo(n - 1) + countStepsMemo(n - 2) + 1;
        }
        if (memo[n] == -1) {
            memo[n] = countStepsMemo(n - 3) + countStepsMemo(n - 2) + countStepsMemo(n - 1);
        }
        return memo[n];
    }


    static int countWays(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
        }
    }


}
