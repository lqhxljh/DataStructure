package com.ljh.data.structure;

public class TreeNodeUtils {
    public static void preTraverse(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.println(treeNode.getValue());
            preTraverse(treeNode.getLeft());
            preTraverse(treeNode.getRight());
        }
    }

    public static void midTraverse(TreeNode treeNode) {
        if (treeNode != null) {
            midTraverse(treeNode.getLeft());
            System.out.println(treeNode.getValue());
            midTraverse(treeNode.getRight());
        }
    }

    public static void lastTraverse(TreeNode treeNode) {
        if (treeNode != null) {
            lastTraverse(treeNode.getLeft());
            lastTraverse(treeNode.getRight());
            System.out.println(treeNode.getValue());
        }
    }

    /**
     * 获取二叉树最大值
     */
    public static int getMaxValue(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        } else {
            int result;
            result = Integer.max(node.getValue(), getMaxValue(node.getLeft()));
            result = Integer.max(result, getMaxValue(node.getRight()));
            return result;
        }

    }

    /**
     * 获取二叉树最大深度
     */
    public static int getMaxValueDepth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int result = 0;
            result = Math.max(getMaxValueDepth(node.getLeft()), getMaxValueDepth(node.getRight())) + 1;
            return result;
        }

    }

    /**
     * 获取二叉树最小深度
     */
    public static int getMinValueDepth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int result = 0;
            int leftDepth = getMinValueDepth(node.getLeft());
            int rightDepth = getMinValueDepth(node.getRight());
            if (leftDepth == 0 && rightDepth == 0)
            {
                return 0;
            }else
            {
                result = Math.min(leftDepth, rightDepth) + 1;
            }
            return result;
        }
    }

    /**
     * 判断是否为平衡二叉树
     */
    public static boolean isBalanceTree(TreeNode node) {
        if (node == null) {
            return true;
        } else {
            int leftDepth = getMaxValueDepth(node.getLeft());
            int rightDepth = getMaxValueDepth(node.getRight());
            if (Math.abs(leftDepth - rightDepth) > 1) {
                return false;
            } else {
                if (!isBalanceTree(node.getLeft())) {
                    return false;
                }
                return isBalanceTree(node.getRight());

            }
        }

    }
}
