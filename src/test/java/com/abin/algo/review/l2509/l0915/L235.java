package com.abin.algo.review.l2509.l0915;

/**
 * 235. 二叉搜索树的最近公共祖先
 */
public class L235 {

    /**
     * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
     * 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return recurse(root, p, q);
    }

    TreeNode recurse(TreeNode root, TreeNode p, TreeNode q){
        if(null == root) return null;
        if(p.val>q.val)
            return recurse(root, q, p);
        if(root.val >=p.val && root.val <= q.val)
            return root;
        if(root.val <= p.val)
            return recurse(root.right, p, q);
        else
            return recurse(root.left,p,q);
    }



    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }



}
