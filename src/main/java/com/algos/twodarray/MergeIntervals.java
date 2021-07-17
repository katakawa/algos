package com.algos.twodarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {

  public static void main(String[] args) {

  }

  public int[][] merge(int[][] intervals) {
    LinkedList<int[]> merged = new LinkedList<>();
    Arrays.sort(intervals, (int[] a, int[] b) -> {
      return Integer.compare(a[0], b[0]);
    });

    for (int[] interval : intervals) {
      // if the list of merged intervals is empty or if the current
      // interval does not overlap with the previous, simply append it.
      if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
        merged.add(interval);
      }
      // otherwise, there is overlap, so we merge the current and previous
      // intervals.
      else {
        merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
      }
    }

    return merged.toArray(new int[merged.size()][2]);
  }
}
