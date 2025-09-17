package com.abin.algo.review.l2509.l0917;

import java.util.ArrayList;
import java.util.List;

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
        recurse(root);
        return list;
    }
    List<Integer> list = new ArrayList<>();
    void recurse(Node root){
        if(null == root) return;
        list.add(root.val);
        for(Node node:root.children){
            recurse(node);
        }
    }



// Definition for a Node.
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
