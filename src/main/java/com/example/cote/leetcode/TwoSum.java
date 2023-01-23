package com.example.cote.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {i, target-nums[i]};
            }
            map.put(nums[i], i); // 무슨 의미?
        }

        return new int[0]; // 왜 굳이 이렇게 반환?
    }
}
