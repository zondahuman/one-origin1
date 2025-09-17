package com.abin.algo.review.l2509.l0917;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

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
        if(null == root) return resultList;
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <size ; i++) {
                Node node = queue.poll();
                list.add(node.val);
                for(Node temp:node.children){
                    queue.offer(temp);
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
