package com.ljh.data.structure;

public class TreeNode {
    /**
     * 当前保存的值
     */
    private int value;
    /**
     * 左节点
     */
    private  TreeNode left;
    /**
     * 右节点
     */
    private  TreeNode right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
