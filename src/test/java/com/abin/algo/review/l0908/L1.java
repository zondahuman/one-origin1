package com.abin.algo.review.l0908;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 */
public class L1 {
    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
     * 你可以按任意顺序返回答案。
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> params = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int need = target - nums[i];
            if(params.containsKey(need)){
                return new int[]{i, params.get(need)};
            }else{
                params.put(nums[i], i);
            }
        }
        return new int[2];
    }


}
