package com.abin.algo.leetcode.array;

/**
 * 26. 删除有序数组中的重复项
 */
public class L26 {
    /**
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow=0, fast =0;
        while(fast < n){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }

}
