package com.algos.twodarray;

import java.util.Arrays;

public class RemoveCoveredIntervals {

    public static void main(String[] args) {
        int res = removeCoveredIntervals(new int[][]{new int[]
                {1, 4},
                {1, 6},
                {2, 8},
        });
        System.out.println(res);
    }


    private static int removeCoveredIntervals(int[][] intervals) {
        int removed = 0;
        int last = -1;

        //Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);

        for (int[] currInterval : intervals) {
            if (currInterval[1] <= last) {
                removed += 1;
            } else {
                last = currInterval[1];
            }
        }

        return intervals.length - removed;
    }
}