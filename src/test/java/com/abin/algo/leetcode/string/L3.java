package com.abin.algo.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 */
public class L3 {

    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
     * 示例 1:
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     *
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     *
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left=0,right=0;
        Map<Character, Integer> window = new HashMap<>();
        int result = 0;
        while(right < n){
            char c = s.charAt(right);
            right++;
            window.put(c, window.getOrDefault(c, 0)+1);
            while(left < right && window.get(c)>1){
                char d = s.charAt(left);
                left++;
                window.put(d, window.get(d)-1);
            }
            result = Math.max(result, right-left);
        }
        return result;
    }



}
