package com.bigdeal.leetbook.simple.linklist.s3;

import java.util.Stack;

public class Solution {
    public ListNode reverseList(ListNode head) {
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
        ListNode newHead = solution.reverseList(head);

        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
