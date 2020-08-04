package com.ljh.data.structure;

import java.util.List;

public class TreeNodeUtils {
    public static void preTraverse(TreeNode treeNode)
    {
        if (treeNode != null)
        {
            System.out.println(treeNode.getValue());
            preTraverse(treeNode.getLeft());
            preTraverse(treeNode.getRight());
        }
    }
    public static void midTraverse(TreeNode treeNode)
    {
        if (treeNode != null)
        {
            midTraverse(treeNode.getLeft());
            System.out.println(treeNode.getValue());
            midTraverse(treeNode.getRight());
        }
    }
    public static void lastTraverse(TreeNode treeNode)
    {
        if (treeNode != null)
        {
            lastTraverse(treeNode.getLeft());
            lastTraverse(treeNode.getRight());
            System.out.println(treeNode.getValue());
        }
    }

}
