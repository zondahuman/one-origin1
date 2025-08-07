package com.abin.algo.review.l0805;

import java.util.*;

/**
 * 107. 二叉树的层序遍历 II
 */
public class L107 {
    /**
     * 给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(null == root)
            return result;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <size ; i++) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if(null != treeNode.left) {
                    queue.offer(treeNode.left);
                }
                if(null != treeNode.right) {
                    queue.offer(treeNode.right);
                }
            }
            result.add(list);
        }
        Collections.reverse(result);
        return result;
    }


    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }


}
