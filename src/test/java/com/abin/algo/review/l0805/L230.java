package com.abin.algo.review.l0805;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 230. 二叉搜索树中第 K 小的元素
 */
public class L230 {

    /**
     * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 小的元素（从 1 开始计数）。
     *
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        kthSmallestRecurse(root, k);
        return result;
    }
    int result = 0;
    int rank = 0;
    public void kthSmallestRecurse(TreeNode root, int k){
        if(root == null)
            return;
        kthSmallestRecurse(root.left, k);
        rank++;
        if(rank == k) {
            result = root.val;
            return;
        }
        kthSmallestRecurse(root.right, k);
    }


    public int kthSmallestLoop(TreeNode root, int k) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);
        while (!deque.isEmpty() || null != root) {
            while (null != root) {
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();
            --k;
            if (0 == k) {
                break;
            }
            root = root.right;
        }
        return root.val;
    }


    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
