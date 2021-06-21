package com.algos.counting;

import java.util.Arrays;

/**
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 *
 *         increase(X) − counter X is increased by 1,
 *         max counter − all counters are set to the maximum value of any counter.
 *
 * A non-empty array A of M integers is given. This array represents consecutive operations:
 *
 *         if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 *         if A[K] = N + 1 then operation K is max counter.
 */
public class MaxCounter {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(5, new int[] {3, 4, 4, 6, 1, 4, 4})));
    }

    private static int[] solve(int countersSize, int[] instructions) {
        int[] counters = new int[countersSize];

        int startLine = 0;
        int currentMax = 0;

        for (int i = 0; i < instructions.length; i++) {
            int counterPosition = instructions[i] - 1;

            if (instructions[i] > countersSize) startLine = currentMax;
            else if (counters[counterPosition] < startLine) counters[counterPosition] = startLine + 1;
            else counters[counterPosition] += 1;

            if (instructions[i] <= countersSize) currentMax = Math.max(counters[counterPosition], currentMax);
        }

        for (int i = 0; i < counters.length; i++) if (counters[i] < startLine) counters[i] = startLine;

        return counters;
    }

}
