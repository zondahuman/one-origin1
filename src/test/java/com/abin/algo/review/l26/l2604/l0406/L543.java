package com.abin.algo.review.l26.l2604.l0406;

/**
 * 129. 求根节点到叶节点数字之和
 * https://leetcode.cn/problems/sum-root-to-leaf-numbers/description/
 */
public class L543 {
    /**
     * 给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
     * 每条从根节点到叶节点的路径都代表一个数字：
     * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
     * 计算从根节点到叶节点生成的 所有数字之和 。
     * 叶节点 是指没有子节点的节点。
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }
    int maxDiameter = 0;
    int maxDepth(TreeNode root){
        if(null == root)
            return 0;
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        maxDiameter = Math.max(maxDiameter, leftMax+rightMax);
        return 1+Math.max(leftMax, rightMax);
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }


}
