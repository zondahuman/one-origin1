package com.abin.algo.review.l26.l2604.l0405;

import com.abin.algo.review.l26.l2604.l0403.L102;

import java.util.*;

/**
 * 107. 二叉树的层序遍历 II
 * https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/description/
 */
public class L107 {
    /**
     * 给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(null == root)
            return resultList;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <size ; i++) {
                TreeNode node = queue.poll();
                if(null != node.left){
                    queue.offer(node.left);
                }
                list.add(node.val);
                if(null != node.right){
                    queue.offer(node.right);
                }
            }
            resultList.add(list);
        }
        Collections.reverse(resultList);
        return resultList;
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

}
