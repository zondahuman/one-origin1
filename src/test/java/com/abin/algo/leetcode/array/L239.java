package com.abin.algo.leetcode.array;

import com.abin.lee.algo.util.JsonUtil;
import org.junit.Test;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class L239 {

    /**
     * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
     * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
     * 返回 滑动窗口中的最大值 。
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int preLen = 0;
        Deque<Integer> queue = new LinkedList<>();
        int tsize = 0;
        for(int num:nums) {
            if(tsize>=k)
                break;
            queue.add(num);
            tsize++;
        }
        int size = nums.length-k+1;
        int[] result = new int[size];
        int total = 0;
        while(total<nums.length){
            int temp = Integer.MIN_VALUE;
            for(Iterator<Integer> iterator=queue.iterator();iterator.hasNext();){
                int num = iterator.next();
                temp = Math.max(temp, num);
            }
            result[preLen] = temp;
            total = preLen + k;
            if(total != nums.length){
                queue.pop();
                queue.addLast(nums[total]);
            }
            preLen++;
        }
        return result;
    }

    @Test
    public void test1(){
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3 ;
        int[] result = maxSlidingWindow(nums, k);
        System.out.println("result="+ JsonUtil.toJson(result));
    }

}
