package com.abin.algo.review.l26.l2604.l0405;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 429. N 叉树的层序遍历
 * https://leetcode.cn/problems/n-ary-tree-level-order-traversal/
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
        Deque<Node> deque = new ArrayDeque<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int sz = deque.size();
            for (int i = 0; i <sz ; i++) {
                Node node = deque.poll();
                list.add(node.val) ;
                for(Node child:node.children){
                    deque.offer(child);
                }
            }
            resultList.add(list);
        }
        return resultList;
    }

    class Node {
        public int val;
        public List<Node> children;
        public Node() {
        }
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
