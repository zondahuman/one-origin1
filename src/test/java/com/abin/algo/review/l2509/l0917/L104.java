package com.abin.algo.review.l2509.l0917;

import com.abin.algo.review.l2509.l0916.L124;

/**
 * 104. 二叉树的最大深度
 */
public class L104 {

    /**
     * 给定一个二叉树 root ，返回其最大深度。
     * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if(null == root)
            return 0;
        else
            return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));

    }



    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
}
