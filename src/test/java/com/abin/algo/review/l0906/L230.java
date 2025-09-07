package com.abin.algo.review.l0906;

/**
 * 230. 二叉搜索树中第 K 小的元素
 */
public class L230 {


    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    int result = 0;
    int rank = 0;

    void traverse(TreeNode root, int k){
        if(null == root) return;
        traverse(root.left, k);
        rank++;
        if(rank == k){
            result = root.val;
            return;
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
