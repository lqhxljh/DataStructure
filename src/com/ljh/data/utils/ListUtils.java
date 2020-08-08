package com.ljh.data.utils;

import com.ljh.data.bean.ListNode;

import java.util.List;

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
    public static ListNode reverse(ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode preNode = null;
        while (node != null) {
            ListNode temp = node.next;
            node.next = preNode;
            preNode = node;
            node = temp;
        }
        return preNode;
    }

    /**
     * 寻找中间元素，使用双指针方法
     */
    public static ListNode findMidNote(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        while (fastNode != null && fastNode.next != null) {

            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

        }
        return slowNode;
    }

    /**
     * 判断是否为循环列表
     */
    public static boolean cyleList(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        while (fastNode != null && fastNode.next != null) {

            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode == slowNode) {
                return true;
            }

        }
        return false;
    }

    /**
     * 合并已经排好序列链表
     */

    public static ListNode mergeList(ListNode listNode1, ListNode listNode2) {
        ListNode temp = new ListNode();
        ListNode result = temp;
        while (listNode1 != null && listNode2 != null) {
            if (listNode1.value < listNode2.value) {
                temp.next = listNode2;
                listNode2 = listNode2.next;

            } else {
                temp.next = listNode1;
                listNode1 = listNode1.next;
            }
            temp = temp.next;
        }
        if (listNode1 != null) {
            temp.next = listNode1;
        } else {
            temp.next = listNode2;
        }
        return result.next;
    }

    /**
     * 删除倒数n个节点
     *
     * @param n
     */
    public void deleteReciprocalNode(ListNode root, int n) {
        ListNode faster = root;//快指针
        ListNode slower = root;//慢指针
        while (faster != null) {
            faster = faster.next;
            n--;
            if (n < 0 && faster != null) {//开始移动慢指针
                slower = slower.next;
            }
        }
        slower.next = slower.next.next;//让慢指针的next指向next的next
    }
}


