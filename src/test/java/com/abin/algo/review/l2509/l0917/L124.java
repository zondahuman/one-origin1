package com.abin.algo.review.l2509.l0917;

/**
 * 124. 二叉树中的最大路径和
 */
public class L124 {
    /**
     * 二叉树中的 路径 被定义为一条节点序列，序列中每对相邻节点之间都存在一条边。同一个节点在一条路径序列中 至多出现一次 。该路径 至少包含一个 节点，且不一定经过根节点。
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
        if(null == root) return 0 ;
        int leftMax = Math.max(maxPath(root.left), 0) ;
        int rightMax = Math.max(maxPath(root.right), 0);
        int prevSum = root.val + leftMax + rightMax;
        maxSum = Math.max(maxSum, prevSum);
        return root.val+Math.max(leftMax, rightMax);
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }


}
