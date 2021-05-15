package com.bigdeal.util;

import com.bigdeal.leetbook.simple.linklist.ListNode;

public class ListNodeUtil {
    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode generate(int maxValue) {
        ListNode head = new ListNode(0);

        ListNode nextNode = head;
        for (int i = 1; i < maxValue; i++) {
            ListNode node = new ListNode(i);
            nextNode.next = node;
            nextNode = node;
        }
        return head;
    }
}
