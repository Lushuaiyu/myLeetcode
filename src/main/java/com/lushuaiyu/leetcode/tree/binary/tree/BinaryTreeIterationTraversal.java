package com.lushuaiyu.leetcode.tree.binary.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 迭代 前序 中序 后续 遍历二叉树
 * Created by jones on 2020-02-25
 *
 * @author lushuaiyu
 */
public class BinaryTreeIterationTraversal {

    /**
     * 迭代二叉树前序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        // 先根遍历二叉树, 也就是说, 对于二叉树中的每一个节点, 先访问根节点, 再访问其左子树,
        // 最后访问右子树
        // 用迭代的方式遍历二叉树, 需要借助栈
        // 1. 将根节点入栈
        // 2. 进入循环, 先弹出栈顶元素, 再访问它, 然后将该元素的右子树入栈, 最后将该元素的左子树入栈
        //    左子树后于右子树入栈保证了左子树先于右子树被访问.
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            list.add(curr.val);
            if (curr.right != null) {
                stack.push(curr.right);
            }

            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
        return list;
    }

    /**
     * 迭代中序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        //借助栈
        Stack<TreeNode> stack = new Stack<>();
        //迭代需要有一个游标
        TreeNode currNode = root;
        //迭代的条件
        while (currNode != null || !stack.isEmpty()) {
            //左子树遍历
            while (currNode != null) {
                stack.push(currNode);
                currNode = currNode.left;
            }
            //中序遍历的值
            currNode = stack.pop();
            list.add(currNode.val);
            currNode = currNode.right;
        }
        return list;
    }


}
