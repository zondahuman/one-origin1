package com.abin.algo.review.l2508.l0819;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 230. 二叉搜索树中第 K 小的元素
 */
public class L230 {


    public int kthSmallest(TreeNode root, int k) {
        reverse(root, k);
        return result;
    }
    int rank = 0;
    int result = 0;
    void reverse(TreeNode root, int k){
        if(null == root)
            return;
        reverse(root.left, k);
        rank++;
        if(rank == k){
            result = root.val;
            return;
        }
        reverse(root.right, k);
    }


    public int kthSmallestLoop(TreeNode root, int k) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);
        int rank = 0;
        int result = 0;
        while(!deque.isEmpty() || null != root){
            while(null != root){
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();
            rank++;
            if(rank == k){
                result = root.val;
                return result;
            }
            if(null != root)
                root = root.right;
        }
        return result;
    }


    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }



}
