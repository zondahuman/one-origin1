package com.abin.algo.review.l2509.l0916;

import org.junit.Test;

/**
 * 543. 二叉树的直径
 * 后续遍历
 */
public class L543 {
    /**
     * 给你一棵二叉树的根节点，返回该树的 直径 。
     * 二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。
     * 两节点之间路径的 长度 由它们之间边数表示。
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        recurse(root);
        return max;
    }
    int max = 0;
    int recurse(TreeNode root){
        if(null == root) return 0;
        int leftMax = recurse(root.left);
        int rightMax = recurse(root.right);
        // 后序遍历位置顺便计算最大直径
        max = Math.max(max, leftMax+rightMax);
        return 1 + Math.max(leftMax, rightMax);
    }



    // 你可以这样构建一棵二叉树：
    // 构建出来的二叉树是这样的：
//      1
//    /  \
//   2    3
//  / \   / \
// 4   7  5   6
//      \
//       9
    public TreeNode createTreeNode() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        root.left.right.right = new TreeNode(9);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        return root;
    }


    @Test
    public void test() {
        TreeNode treeNode = createTreeNode();
        Integer result = diameterOfBinaryTree(treeNode);
        System.out.println("result=" + result);
    }
    
    
    
    

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
}
