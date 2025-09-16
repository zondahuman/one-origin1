package com.abin.algo.review.l0916;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N 叉树的后序遍历
 */
public class L590 {

    /**
     * 给定一个 n 叉树的根节点 root ，返回 其节点值的 后序遍历 。
     * n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
     * @param root
     * @return
     */
    public List<Integer> postorder(Node root) {
        recurse(root);
        return list;
    }
    List<Integer> list = new ArrayList<>();
    /**
     *
     * @param root
     * @return
     */
    void recurse(Node root){
        if(null == root) return;
        for(Node temp:root.children){
            recurse(temp) ;
        }
        list.add(root.val) ;
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



