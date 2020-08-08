package sample;


import com.ljh.data.utils.SortUtils;
import com.ljh.data.bean.TreeNode;
import com.ljh.data.utils.TreeNodeUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        SortUtils.quickSort(arr);
        System.out.println(Arrays.toString(arr));
        TreeNode node = new TreeNode();
        node.setValue(0);

        TreeNode childNodeLeft = new TreeNode();
        childNodeLeft.setValue(1);
        TreeNode childNodeRight = new TreeNode();
        childNodeRight.setValue(2);
        node.setLeft(childNodeLeft);
        node.setRight(childNodeRight);

        TreeNode childNodeLeft1 = new TreeNode();
        childNodeLeft1.setValue(3);
        TreeNode childNodeRight1 = new TreeNode();
        childNodeRight1.setValue(4);
        childNodeLeft.setLeft(childNodeLeft1);
        childNodeLeft.setRight(childNodeRight1);



        /**
         * 先序排列
         */
        TreeNodeUtils.preTraverse(node);
        TreeNodeUtils.preTraverse(node);
        /**
         * 中序排列
         */
        TreeNodeUtils.midTraverse(node);
        /**
         * 后序排列
         */
        TreeNodeUtils.lastTraverse(node);

        /**
         * 获取最大值
         */
        int result = TreeNodeUtils.getMaxValue(node);
        System.out.println("二叉树最大值" + result);
        /**
         * 获取最大深度
         */
        result = TreeNodeUtils.getMinValueDepth(node);
        System.out.println("二叉树最小深度" + result);
        /**
         * 判断是否为平衡二叉树
         */
        boolean isBalanceTree = TreeNodeUtils.isBalanceTree(node);
        System.out.println("二叉树最小深度" + isBalanceTree);

        ListNodeTest test  = new ListNodeTest();
        test.test();
    }
}
