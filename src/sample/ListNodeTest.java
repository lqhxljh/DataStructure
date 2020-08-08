package sample;

import com.ljh.data.bean.ListNode;
import com.ljh.data.utils.ListUtils;

public class ListNodeTest {
    public void test() {
        ListNode listNode = new ListNode();
        listNode.value = 0;

        listNode.next = new ListNode();
        listNode.next.value = 1;

        ListNode node1 = new ListNode();
        node1.value = 2;
        listNode.next.next = node1;

        ListNode node2 = new ListNode();
        node2.value = 3;
        node1.next = node2;
        /**
         * 遍历
         */
        StringBuilder content = new StringBuilder();
        ListNode node = listNode;
        while (node != null) {
            content.append(node.value + ",");
            node = node.next;
        }
        System.out.println(content);
        listNode =   ListUtils.deleteNode(listNode,0);
        /**
         * 遍历
         */
        StringBuilder content2 = new StringBuilder();
        ListNode nodeDelete = listNode;
        while (nodeDelete != null) {
            content2.append(nodeDelete.value + ",");
            nodeDelete = nodeDelete.next;
        }

        ListNode nodeReverseResult = ListUtils.reverse(listNode);
        StringBuilder content3 = new StringBuilder("nodeReverse");
        ListNode nodeReverse= nodeReverseResult;
        while (nodeReverse != null) {
            content3.append(nodeReverse.value + ",");
            nodeReverse = nodeReverse.next;
        }
        System.out.println(content3);
        ListNode midNode = ListUtils.findMidNote(nodeReverseResult);
        System.out.println("中间元素"+ midNode.value);

    }
}
