package com.abin.algo.review.l2509.l0917;

/**
 * 129. 求根节点到叶节点数字之和
 */
public class L129 {

    /**
     * 给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
     * 每条从根节点到叶节点的路径都代表一个数字：
     * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
     * 计算从根节点到叶节点生成的 所有数字之和 。
     * 叶节点 是指没有子节点的节点。
     * @param root
     * @return
     */
    public int sumNumbers(TreeNode root) {
        return recurse(root, 0);
    }

    int recurse(TreeNode root, int prev){
        if(null == root)return 0;
        int curSum = prev*10 + root.val;
        if(root.left == null && root.right == null)
            return curSum;
        else
            return recurse(root.left, curSum)+recurse(root.right, curSum);
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

}
