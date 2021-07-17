package com.algos.pointer;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int firstPointer = 0;

        for (int secondPointer = 1; secondPointer < nums.length; secondPointer++) {
            if (nums[secondPointer] != nums[firstPointer]) {
                firstPointer++;
                nums[firstPointer] = nums[secondPointer];
            }
        }

        return firstPointer + 1;
    }

}
