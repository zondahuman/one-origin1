package com.abin.algo.review.l26.l2604.l0406;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 347. 前 K 个高频元素
 * https://leetcode.cn/problems/top-k-frequent-elements/
 */
public class L347 {
    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
     * 示例 1：
     * 输入：nums = [1,1,1,2,2,3], k = 2
     * 输出：[1,2]
     *
     * 示例 2：
     * 输入：nums = [1], k = 1
     * 输出：[1]
     *
     * 示例 3：
     * 输入：nums = [1,2,1,2,1,2,3,1,3,2], k = 2
     * 输出：[1,2]
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequentMap = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            frequentMap.put(nums[i], frequentMap.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((entry1, entry2)->(entry1.getValue().compareTo(entry2.getValue()))); //大顶堆
        for(Map.Entry<Integer,Integer> entry : frequentMap.entrySet()){
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }
        int[] result = new int[pq.size()];
        int i = 0;
        for (Iterator<Map.Entry<Integer,Integer>> iterator=pq.iterator();iterator.hasNext();){
            Map.Entry<Integer,Integer> entry = iterator.next();
            result[i] = entry.getKey();
            i++;
        }
        return result;
    }


}
