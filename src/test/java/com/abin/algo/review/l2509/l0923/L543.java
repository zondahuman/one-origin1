package com.abin.algo.review.l2509.l0923;

/**
 * 543. 二叉树的直径
 */
public class L543 {

    /**
     * 给你一棵二叉树的根节点，返回该树的 直径 。
     * 二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。
     * 两节点之间路径的 长度 由它们之间边数表示。
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if(null == root) return 0;
        recurse(root);
        return maxDiameter;
    }
    int maxDiameter=0;
    int recurse(TreeNode root){
        if(null == root) return 0;
        int leftMax = recurse(root.left);
        int rightMax = recurse(root.right);
        maxDiameter = Math.max(maxDiameter, leftMax +rightMax);
        return 1 + Math.max(leftMax, rightMax);
    }



    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

}
