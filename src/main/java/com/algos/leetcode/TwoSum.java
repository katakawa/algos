package com.algos.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main(String[] args) {
        findIndicesBruteForce(new int[] {1, 3, 3, 3, 3}, 4);
        System.out.println("************************************");
        findIndicesBruteForce(new int[] {1, 3, 3, 3, 3}, 4);
    }

    /**
     * Brute Force solution
     * @param nums
     * @param target
     * @return
     */
    static int[] findIndicesBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = i + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j]) == target) System.out.println(i + " " + j);
                }
            }
        }
        return null;
    }

    static int[] findIndices(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) System.out.println(i + " " + map.get(diff));
        }

        return null;
    }




}
