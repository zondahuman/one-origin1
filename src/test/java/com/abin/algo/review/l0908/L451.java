package com.abin.algo.review.l0908;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 451. 根据字符出现频率排序
 */
public class L451 {
    /**
     * 给定一个字符串 s ，根据字符出现的 频率 对其进行 降序排序 。一个字符出现的 频率 是它出现在字符串中的次数。
     * 返回 已排序的字符串 。如果有多个答案，返回其中任何一个。
     * @param s
     * @return
     */
    public String frequencySort(String s) {
        Map<Character, Integer> params = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            params.put(s.charAt(i), params.getOrDefault(s.charAt(i), 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Character, Integer> entry:params.entrySet()){
            pq.offer(entry);
        }
        StringBuilder builder = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            String part = String.valueOf(entry.getKey()).repeat(entry.getValue());
            builder.append(part);
        }
        return builder.toString();
    }

}
