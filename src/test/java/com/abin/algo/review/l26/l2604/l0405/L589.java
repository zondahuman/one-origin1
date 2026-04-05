package com.abin.algo.review.l26.l2604.l0405;

import java.util.*;

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
        Stack<Node> stack = new Stack<>();
        List<Integer> resultList = new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            resultList.add(node.val);
            int size = node.children.size() ;
            //i=size-1，先压进去size-1，再压进去0，那么栈出来的时候顺序就是，先出0，再出size-1
            for (int i = size-1; i >=0 ; --i) {
                stack.push(node.children.get(i));
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
