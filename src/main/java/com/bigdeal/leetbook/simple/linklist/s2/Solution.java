package com.bigdeal.leetbook.simple.linklist.s2;

import com.bigdeal.model.ListNode;

public class Solution {
    public ListNode deleteNode(ListNode head, int n) {
        return deleteNodeByPointer(head, n);
    }

    private ListNode deleteNodeByPointer(ListNode head, int n) {
        ListNode right = head;
        ListNode left = head;

        for (int i = 0; i < n; i++) {
            if (right.next != null) {
                right = right.next;
            }
        }

        if (right == null) {
            return head;
        }

        if (head.next == right) {
            return right;
        }

        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;

        return head;
    }
}
