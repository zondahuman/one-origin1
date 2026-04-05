package com.abin.algo.review.l26.l2604.l0405;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 589. N 叉树的前序遍历
 * https://leetcode.cn/problems/n-ary-tree-preorder-traversal/description/
 */
public class L589 {
    /**
     * 给定一个 n 叉树的根节点  root ，返回 其节点值的 前序遍历 。
     * n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        Deque<Node> deque = new ArrayDeque<>();
        List<Integer> resultList = new ArrayList<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            int size = deque.size() ;
            for (int i = 0; i <size ; i++) {
                Node node = deque.poll();
                resultList.add(node.val);
                for (Node child:node.children)
                    deque.offer(child);
            }
        }
        return resultList ;
    }

    List<Integer> resultList2 = new ArrayList<>();
    public List<Integer> preorder2(Node root) {
        traverse(root);
        return resultList2;
    }

    void traverse(Node root){
        if(null == root)
            return;
        resultList2.add(root.val);
        for(Node node:root.children)
            traverse(node);
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
