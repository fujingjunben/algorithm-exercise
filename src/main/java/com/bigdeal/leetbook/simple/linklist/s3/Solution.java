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
        ListNode node = head;
        while (node != null) {
            ListNode tmpNode = node.next;
            node.next = newHead;
            newHead = node;
            node = tmpNode;
        }
        return newHead;
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

        ListNode newHead = solution.reverseListByList(head);
        printListNode(newHead);

    }

    private static void printListNode(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
