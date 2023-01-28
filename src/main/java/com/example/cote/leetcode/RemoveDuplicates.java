package com.example.cote.leetcode;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            nums[i++] = nums[j];

            while (j != nums.length - 1 && nums[j] == nums[j + 1]) {
                j++;
            }
        }

        return i;
    }
}
