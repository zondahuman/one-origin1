package com.abin.algo.review.l0908;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 347. 前 K 个高频元素
 */
public class L347 {

    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
     * 进阶：你所设计算法的时间复杂度 必须 优于 O(n log n) ，其中 n 是数组大小。
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> params = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            params.put(nums[i], params.getOrDefault(nums[i], 0)+1);
        }
        // 队列按照键值对中的值（元素出现频率）从小到大排序
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));
        for (Map.Entry<Integer, Integer> entry : params.entrySet()) {
            pq.offer(entry);
            if(pq.size()>k){
                // 弹出最小元素，维护队列内是 k 个频率最大的元素
                pq.poll();
            }
        }
        int[] result = new int[k];
        for (int i = 0; i <k ; i++) {
            result[i] = pq.poll().getKey();
        }
        return result;
    }



}
