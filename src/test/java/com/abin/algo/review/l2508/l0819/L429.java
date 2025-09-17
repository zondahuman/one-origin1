package com.abin.algo.review.l2508.l0819;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N 叉树的层序遍历
 */
public class L429 {

    /**
     * 给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
     * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔（参见示例）。
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(null == root)
            return resultList;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <size ; i++) {
                Node temp = queue.poll();
                list.add(temp.val);
                for(Node node:temp.children){
                    queue.offer(node);
                }
            }
            resultList.add(list);
        }
        return resultList;
    }



    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };






}
