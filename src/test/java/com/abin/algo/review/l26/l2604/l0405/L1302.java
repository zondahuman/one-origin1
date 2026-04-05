package com.abin.algo.review.l26.l2604.l0405;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1302. 层数最深叶子节点的和
 * https://leetcode.cn/problems/deepest-leaves-sum/description/
 */
public class L1302 {
    /**
     * 给你一棵二叉树的根节点 root ，请你返回 层数最深的叶子节点的和 。
     * @param root
     * @return
     */
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int deepSum = 0;
        while(!queue.isEmpty()){
            deepSum=0;
            int size = queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
                deepSum+=node.val;
            }
        }
        return deepSum;
    }


    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
}
