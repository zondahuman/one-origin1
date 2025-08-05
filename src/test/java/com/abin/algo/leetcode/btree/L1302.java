package com.abin.algo.leetcode.btree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1302. 层数最深叶子节点的和
 */
public class L1302 {

    /**
     * 给你一棵二叉树的根节点 root ，请你返回 层数最深的叶子节点的和 。
     * @param root
     * @return
     */
    public int deepestLeavesSum(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        int sum = 0;
        while(!deque.isEmpty()){
            //每执行一层计算，也就是执行一次for循环，就重置为0，那么每次都是单层的和
            sum = 0;
            int size = deque.size();
            for (int i = 0; i <size ; i++) {
                TreeNode node = deque.poll();
                sum+= node.val;
                if(node.left != null)
                    deque.offer(node.left);
                if(node.right != null)
                    deque.offer(node.right);
            }
        }
        return sum;
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
}
