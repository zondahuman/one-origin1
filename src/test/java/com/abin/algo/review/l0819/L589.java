package com.abin.algo.review.l0819;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 589. N 叉树的前序遍历
 */
public class L589 {
    /**
     * 给定一个 n 叉树的根节点  root ，返回 其节点值的 前序遍历 。
     * n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        reverse(root);
        return resultList;
    }
    List<Integer> resultList = new ArrayList<>();
    public void reverse(Node root){
        if(null == root)
            return;
        resultList.add(root.val);
        for(Node temp:root.children){
            reverse(temp);
        }
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
