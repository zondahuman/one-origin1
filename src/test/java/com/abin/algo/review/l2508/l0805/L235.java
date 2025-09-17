package com.abin.algo.review.l2508.l0805;

/**
 * 235. 二叉搜索树的最近公共祖先
 * 一共就三种情况，搞清楚这个就很简单了。
 * 1、如果当前节点比q。p两个节点都大的话，那么最近的公共祖先一定在当前节点的左边
 * 2、如果当前节点比q，p两个节点都小的话，那么最近的公共祖先一定在当前节点的右边
 * 3、如果当前节点刚好处于中间的位置，那么当前节点就是q，p的最近公共祖先
 */
public class L235 {

    /**
     * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
     * 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root)
            return null;
        if (p.val > q.val)
            return lowestCommonAncestor(root, q, p);
        if (root.val >= p.val && root.val <= q.val)
            return root;
        if (q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }


    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
