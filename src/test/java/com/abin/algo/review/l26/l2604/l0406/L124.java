package com.abin.algo.review.l26.l2604.l0406;

/**
 * 124. 二叉树中的最大路径和
 * https://leetcode.cn/problems/binary-tree-maximum-path-sum/
 */
public class L124 {
    /**
     * 二叉树中的 路径 被定义为一条节点序列，序列中每对相邻节点之间都存在一条边。同一个节点在一条路径序列中 至多出现一次 。
     * 该路径 至少包含一个 节点，且不一定经过根节点。
     * 路径和 是路径中各节点值的总和。
     * 给你一个二叉树的根节点 root ，返回其 最大路径和 。
     * @param root
     * @return
     */
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;
    }
    int maxSum = Integer.MIN_VALUE;
    int maxPath(TreeNode root){
        if(null == root)
            return 0;
        int leftMax = Math.max(0,maxPath(root.left));
        int rightMax = Math.max(0,maxPath(root.right));
        int pathMaxSum = leftMax+rightMax+root.val ;
        maxSum = Math.max(maxSum, pathMaxSum);
        return root.val+ Math.max(leftMax, rightMax);
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

}
