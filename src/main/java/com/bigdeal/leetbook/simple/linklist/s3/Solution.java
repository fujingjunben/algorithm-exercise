package com.bigdeal.leetbook.simple.linklist.s3;

import com.bigdeal.model.ListNode;
import com.bigdeal.util.ListNodeUtil;

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

    public static void main(String[] args) {
        ListNode head = ListNodeUtil.generate(5);

        Solution solution = new Solution();
        ListNode newHead = solution.reverseListByStack(head);

        ListNodeUtil.printListNode(newHead);
    }
}
