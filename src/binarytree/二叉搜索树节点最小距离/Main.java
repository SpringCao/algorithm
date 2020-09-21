package binarytree.二叉搜索树节点最小距离;

import binarytree.TreeNode;

public class Main {
    Integer pre,res;
    public static void main(String[] args) {

    }

    private int minDiffInBST(TreeNode root){
        pre = null;
        res = Integer.MAX_VALUE;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root){
        if (root == null) return;
        dfs(root.left);
        if (pre != null){
            res = Math.min(res,root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }
}
