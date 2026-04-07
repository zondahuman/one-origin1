package com.abin.algo.review.l26.l2604.l0407;

import java.util.*;

/**
 * 692. 前K个高频单词
 * https://leetcode.cn/problems/top-k-frequent-words/description/
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
        Map<String, Integer> frequentMap = new HashMap<>();
        for(String str:words){
            frequentMap.put(str, frequentMap.getOrDefault(str, 0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>((a,b)->{
                if(a.getValue().equals(b.getValue())) {
                    return b.getKey().compareTo(a.getKey());
                }
                return a.getValue().compareTo(b.getValue());
        });
        for(Map.Entry<String,Integer> entry:frequentMap.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        LinkedList<String> list = new LinkedList<>();
        while(!pq.isEmpty()){
            Map.Entry<String,Integer> entry = pq.poll();
            list.addFirst(entry.getKey());
        }
        return list;
    }


}
