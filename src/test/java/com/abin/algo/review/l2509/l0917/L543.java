package com.abin.algo.review.l2509.l0917;

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
        maxDepth(root);
        return result;
    }
    int result = 0;
    int maxDepth(TreeNode root){
        if(null == root) return 0;
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        result = Math.max(result, leftMax+rightMax);
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
