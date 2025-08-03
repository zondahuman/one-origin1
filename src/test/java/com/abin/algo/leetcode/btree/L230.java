package com.abin.algo.leetcode.btree;

import java.util.Stack;

/**
 * 230. 二叉搜索树中第 K 小的元素
 * BST 的中序遍历结果是有序的（升序），所以用一个外部变量记录中序遍历结果第 k 个元素即是第 k 小的元素。
 */
public class L230 {

    /**
     * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 小的元素（从 1 开始计数）。
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        if(null == root)
            return 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int count = 0;
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if(null != temp.left){
                stack.push(temp.left);
            }
            if(null != temp.right){
                stack.push(temp.right);
            }
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
