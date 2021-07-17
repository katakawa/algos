package com.algos.twodarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {

  public static void main(String[] args) {

  }

  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (int[] a, int[] b) -> {
      return Integer.compare(a[0], b[0]);
    });
    LinkedList<int[]> mergedIntervals = new LinkedList<>();

    for (int[] interval : intervals) {
      if (mergedIntervals.isEmpty() || mergedIntervals.getLast()[1] < interval[0]) {
        mergedIntervals.add(interval);
      }
      else {
        mergedIntervals.getLast()[1] = Math.max(mergedIntervals.getLast()[1], interval[1]);
      }
    }

    return mergedIntervals.toArray(new int[mergedIntervals.size()][2]);
  }
}
