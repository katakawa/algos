package com.algos.twodarray;

import java.util.*;

public class MergeIntervals {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(1);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);

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
