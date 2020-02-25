package com.lushuaiyu.leetcode.tree.binary.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归前序 中序 后续遍历二叉树
 * Created by jones on 2020-02-24
 *
 * @author lushuaiyu
 */
public class BinaryTreeRecursiveTraversal {
    List<Integer> list = new ArrayList<>();

    /**
     * 递归前序遍历二叉树
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        preorderTraversal(root, list);
        return list;
    }

    public void preorderTraversal(TreeNode root, List<Integer> list) {
        if (null == root) {
            return;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    /**
     * 递归中序遍历二叉树
     */
    //public List<Integer> preorderTraversal(TreeNode root) {
    //    if(null == root){
    //        return list;
    //    }
    //    list.add(root.val);
    //    preorderTraversal(root.left);
    //    preorderTraversal(root.right);
    //    return list;
    //}


    /**
     * 递归后序遍历二叉树
     */
    //public List<Integer> inorderTraversal(TreeNode root) {
    //    if(null == root){
    //        return list;
    //    }
    //    inorderTraversal(root.left);
    //    list.add(root.val);
    //    inorderTraversal(root.right);
    //    return list;
    //}


}
