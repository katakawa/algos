package com.algos.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInArray {

    public static void main(String[] args) {
        System.out.println(findPairs(new int[] {3, 3, 3, 3}, 0));
    }

    private static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count number of elements in the array, appear more than or equal twice.
                //rework
                if (entry.getValue() >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}