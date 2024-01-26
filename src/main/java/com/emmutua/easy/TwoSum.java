package com.emmutua.easy;

import java.util.Arrays;

class TwoSum {

    public static void main(String[] args) {
        int [] nums  = {2,4,6,9};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        // nums = {2,7,8,78}, target = 9
        // Output = [0,1]
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
