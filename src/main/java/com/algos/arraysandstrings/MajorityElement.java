package com.algos.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    private static int majorityElement1(int[] nums) {
        Map<Integer, Integer> hash_map = new HashMap<>();
        int ans = nums[0];
        int count = 0;

        for(int i = 0; i < nums.length; i++) {            
            if (hash_map.containsKey(nums[i])) {
                count = Math.max(count, hash_map.get(nums[i]));
                hash_map.put(nums[i], hash_map.get(nums[i]) + 1);

                if (hash_map.get(nums[i]) > count) ans = nums[i];

            } else {
                hash_map.put(nums[i], 1);
            }
        }
        return ans;
    }

    private static int majorityElement2(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

}