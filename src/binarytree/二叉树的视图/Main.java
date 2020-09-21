package binarytree.二叉树的视图;

import binarytree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for(int i = 0; i < 7; i++)
        {
            node[i] = new TreeNode(i);
        }
        for(int i = 0; i < 7; i++)
        {
            if(i*2+1 < 7)
                node[i].left = node[i*2+1];
            if(i*2+2 < 7)
                node[i].right = node[i*2+2];
        }

        sideView(node[0]);
    }

    private static void sideView(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = 0;
        while (!queue.isEmpty()){
            size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                if (i == 0){
                    System.out.print(node.val + " ");
                }
                if (i == size -1){
                    System.out.println(node.val + " ");
                }
            }
        }
    }
}
