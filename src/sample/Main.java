package sample;


import com.ljh.data.sort.SortUtils;
import com.ljh.data.structure.TreeNode;
import com.ljh.data.structure.TreeNodeUtils;

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
        childNodeLeft1.setValue(1);
        TreeNode childNodeRight1 = new TreeNode();
        childNodeRight1.setValue(2);
        childNodeLeft.setLeft(childNodeLeft1);
        childNodeLeft.setRight(childNodeRight1);


        TreeNode childNodeLeft12 = new TreeNode();
        childNodeLeft12.setValue(1);
        TreeNode childNodeRight12 = new TreeNode();
        childNodeRight12.setValue(2);
        childNodeRight.setLeft(childNodeLeft12);
        childNodeRight.setRight(childNodeRight12);
        /**
         * 先序排列
         */
        TreeNodeUtils.preTraverse(node);
        /**
         * 中序排列
         */
        TreeNodeUtils.midTraverse(node);
        /**
         * 后序排列
         */
        TreeNodeUtils.lastTraverse(node);

    }
}
