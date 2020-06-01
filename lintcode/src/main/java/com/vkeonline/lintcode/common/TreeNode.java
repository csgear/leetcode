package com.vkeonline.lintcode.common;

import com.vkeonline.lintcode.SumOfLeftLeaves;

public class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}