package com.abin.algo.review.l26.l2604.l0410;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 */
public class L3 {
    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
     * 示例 1:
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。注意 "bca" 和 "cab" 也是正确答案。
     *
     * 示例 2:
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     *
     * 示例 3:
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> hashMap = new HashMap<>();
        int left=0,right=0;
        int maxLen=0;
        while (right<s.length()){
            char c = s.charAt(right);
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
            right++;
            while(hashMap.get(c)>1){
                char d = s.charAt(left);
                left++;
                hashMap.put(d, hashMap.get(d)-1);
            }
            maxLen = Math.max(maxLen, right-left);
        }
        return maxLen;
    }


}
