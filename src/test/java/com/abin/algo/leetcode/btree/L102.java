package com.abin.algo.leetcode.btree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 */
public class L102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(null ==root) return result;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if(null != temp.left){
                    queue.offer(temp.left);
                }
                if(null != temp.right){
                    queue.offer(temp.right);
                }
            }
            result.add(list);
        }
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
