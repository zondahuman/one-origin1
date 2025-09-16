package com.abin.algo.review.l0916;

/**
 * 124. 二叉树中的最大路径和
 *  后序遍历位置，顺便更新最大路径和
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
        if(null == root) return 0;
        recurse(root);
        return maxSum;
    }
    int maxSum = Integer.MIN_VALUE;
    int recurse(TreeNode root){
        if(null == root) return 0;
        int leftMax = Math.max(0, recurse(root.left));
        int rightMax = Math.max(0, recurse(root.right));
        // 后序遍历位置，顺便更新最大路径和
        int partSum = root.val + leftMax + rightMax ;
        maxSum = Math.max(maxSum, partSum);
        return root.val + Math.max(leftMax, rightMax);
    }



    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }



}
