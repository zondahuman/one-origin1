package com.abin.algo.leetcode.array;

public class L1 {

    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = 0;
        while(left < right){
            if(target == (nums[left] + nums[right])){
                return new int[]{left,right};
            }
            right++;
            if(right == nums.length-1){
                left++;
                right = left +1;

            }
        }
        return new int[]{};
    }



}
