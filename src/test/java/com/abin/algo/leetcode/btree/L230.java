package com.abin.algo.leetcode.btree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 230. 二叉搜索树中第 K 小的元素
 * BST 的中序遍历结果是有序的（升序），所以用一个外部变量记录中序遍历结果第 k 个元素即是第 k 小的元素。
 */
public class L230 {
    /**
     * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 小的元素（从 1 开始计数）。
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k){
        kthSmallestRecursion(root, k);
        return result;
    }

    int result = 0;
    int rank = 0;
    public void kthSmallestRecursion(TreeNode root, int k) {
        if(null == root)
            return;
        kthSmallestRecursion(root.left, k);
        rank++;
        if(k == rank) {
            result = root.val;
            return;
        }
        kthSmallestRecursion(root.right,k);
    }

    public int kthSmallestLoop(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (null != root || !stack.isEmpty()) {
            while (null != root) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            --k;
            if (k == 0)
                break;
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
