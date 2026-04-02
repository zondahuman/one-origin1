package com.abin.algo.review.l26.l2604;

import com.abin.lee.algo.leetcode.questions.tree.binary.L222CountCompleteTreeNodes;

/**
 * 230. 二叉搜索树中第 K 小的元素
 * https://leetcode.cn/problems/kth-smallest-element-in-a-bst/description/
 */
public class L230 {
    /**
     * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 小的元素（k 从 1 开始计数）。
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    int result = 0;
    int rank =0;
    void traverse(TreeNode root, int k){
        if(null == root)
            return ;
        traverse(root.left, k);
        rank++;
        if(rank == k) {
            result = root.val;
            return ;
        }
        traverse(root.right, k);
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }


}
