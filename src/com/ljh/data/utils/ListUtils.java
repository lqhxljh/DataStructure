package com.ljh.data.utils;

import com.ljh.data.bean.ListNode;

public class ListUtils {
    /**
     * @param root 链表头节点
     * @param code 需要删除值
     */
    public static ListNode deleteNode(ListNode root, int code) {
        ListNode node = root;
        ListNode preNode = null;
        if (root != null) {
            while (node != null) {
                if (node.value == code) {
                    if (preNode == null) {
                        root = root.next;
                    } else {
                        preNode.next = node.next;
                        preNode = node.next;
                    }
                } else {
                    preNode = node;
                }
                node = node.next;
            }
        }
        return root;
    }

    /**
     * 翻转链表
     */
    public void reverse(ListNode node) {
        ListNode preNode = null;

        while (node != null) {
            if (preNode == null) {
                preNode = node;
            } else {

            }
            node = node.next;
        }
    }


}
