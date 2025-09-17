package com.abin.algo.review.l2509.l0917;

/**
 * 111. 二叉树的最小深度
 */
public class L111 {
    /**
     * 给定一个二叉树，找出其最小深度。
     * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     * 说明：叶子节点是指没有子节点的节点。
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if(null == root)
            return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(leftDepth == 0)
            return rightDepth+1;
        if(rightDepth == 0)
            return leftDepth+1;
        else
            return 1+Math.min(rightDepth, leftDepth);
    }



    public int minDepth2(TreeNode root) {

        return 0;
    }


    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }




}
