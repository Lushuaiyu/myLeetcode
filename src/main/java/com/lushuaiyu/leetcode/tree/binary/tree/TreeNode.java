package com.lushuaiyu.leetcode.tree.binary.tree;

import lombok.Data;

/**
 * Created by jones on 2020-02-24
 *
 * @author lushuaiyu
 */
@Data
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public TreeNode() {

    }
}
