package com.abin.algo.review.l0915;

/**
 * 230. 二叉搜索树中第 K 小的元素
 */
public class L230 {

    /**
     * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 小的元素（从 1 开始计数）。
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        recurse(root, k);
        return result;
    }

    int rank =0;
    int result = 0;

    void recurse(TreeNode root, int k){
        if(null == root) return;
        recurse(root.left, k);
        rank++;
        if(rank == k){
            result = root.val;
            return;
        }
        recurse(root.right, k);
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}
