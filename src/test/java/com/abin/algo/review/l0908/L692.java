package com.abin.algo.review.l0908;

import java.sql.Array;
import java.util.*;

/**
 * 692. 前K个高频单词
 */
public class L692 {

    /**
     * 给定一个单词列表 words 和一个整数 k ，返回前 k 个出现次数最多的单词。
     * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率， 按字典顺序 排序。
     * @param words
     * @param k
     * @return
     */
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> params = new HashMap<>();
        for(String word:words)
            params.put(word, params.getOrDefault(word, 0)+1);
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<String, Integer> entry:params.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            list.add(pq.poll().getKey());
        }
        return list;
    }


}
