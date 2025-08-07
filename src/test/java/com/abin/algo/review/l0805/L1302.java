package com.abin.algo.review.l0805;

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
            sum = 0;
            int size = deque.size();
            for (int i = 0; i <size ; i++) {
                TreeNode treeNode = deque.poll();
                sum+=treeNode.val;
                if(treeNode.left!=null){
                    deque.offer(treeNode.left);
                }
                if(null != treeNode.right){
                    deque.offer(treeNode.right);
                }
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
