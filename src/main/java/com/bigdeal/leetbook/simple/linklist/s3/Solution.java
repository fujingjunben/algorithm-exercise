package com.bigdeal.leetbook.simple.linklist.s3;

import java.util.Stack;

public class Solution {
    public ListNode reverseListByStack(ListNode head) {
        if (head == null) {
            return null;
        }

        Stack<ListNode> stack = new Stack<>();
        stack.push(head);

        ListNode node = head.next;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        ListNode newHead = stack.pop();
        ListNode nextNode = newHead;
        while (!stack.isEmpty()) {
            ListNode newNode = stack.pop();
            nextNode.next = newNode;
            nextNode = newNode;
        }
        nextNode.next = null;

        return newHead;
    }

    public ListNode reverseListByList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode tmpNode = head.next;
            head.next = newHead;
            newHead = head;
            head = tmpNode;
        }
        return newHead;
    }

    public ListNode reverseListByRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = head.next;
        ListNode newHead = reverseListByRecursion(node);

        node.next = head;
        head.next = null;

        return newHead;
    }

    public ListNode reverseListByTailRecursion(ListNode head) {
        return reverseListByTailRecursionHelper(head, null);
    }

    private ListNode reverseListByTailRecursionHelper(ListNode head,
                                                      ListNode newHead) {
        if (head == null) {
            return newHead;
        }
        ListNode node = head.next;
        head.next = newHead;
        return reverseListByTailRecursionHelper(node, head);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);

        ListNode nextNode = head;
        for (int i = 1; i < 5; i++) {
            ListNode node = new ListNode(i);
            nextNode.next = node;
            nextNode = node;
        }

        Solution solution = new Solution();
//        ListNode newHead = solution.reverseListByStack(head);
//        printListNode(newHead);

        ListNode newHead = solution.reverseListByStack(head);
        printListNode(head);
//        printListNode(newHead);

    }

    private static void printListNode(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
