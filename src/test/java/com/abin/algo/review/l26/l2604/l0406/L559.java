package com.abin.algo.review.l26.l2604.l0406;

import java.util.List;

/**
 * 559. N 叉树的最大深度
 * https://leetcode.cn/problems/maximum-depth-of-n-ary-tree/description/
 */
public class L559 {
    /**
     * 给定一个 N 叉树，找到其最大深度。
     * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
     * N 叉树输入按层序遍历序列化表示，每组子节点由空值分隔（请参见示例）。
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        if(null == root)
            return 0;
        int subTreeLen = 0;
        for(Node child:root.children){
            subTreeLen =  Math.max(subTreeLen, maxDepth(child));
        }
        return 1+subTreeLen;
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
