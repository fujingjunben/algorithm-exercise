package com.bigdeal.leetcode.s2;

/**
 * Definition for singly-linked lis */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return getListNode(l1, l2, 0);
    }

    private ListNode getListNode(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {
            if (carry == 1) {
                ListNode node = new ListNode();
                node.val = 1;
                node.next = null;
                return node;
            } else {
                return null;
            }
        }

        ListNode node = new ListNode();
        ListNode nextL1 = null;
        ListNode nextL2 = null;
        int sum = 0;
        if (l1 == null) {
            sum = l2.val + carry;
            nextL2 = l2.next;
        } else if (l2 == null) {
            sum = l1.val + carry;
            nextL1 = l1.next;
        } else {
            sum = l1.val + l2.val + carry;
            nextL1 = l1.next;
            nextL2 = l2.next;
        }
        int reminder = sum - 10;
        int nextCarry = 0;
        if (reminder >= 0) {
            node.val = reminder;
            nextCarry = 1;
        } else {
            node.val = sum;
        }
        node.next = getListNode(nextL1, nextL2, nextCarry);
        return node;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{9, 9, 9, 9, 9, 9, 9};
        int[] a2 = new int[]{9, 9, 9, 9};

        ListNode head = new ListNode();
        head.val = a1[1];


        ListNode l1 = new ListNode();
        l1.val = a1[0];
        l1.next = head;

        for (int i = 2; i < a1.length; i++) {
            ListNode node = new ListNode();
            node.val = a1[i];
            head.next = node;
            head = node;
        }

        head = new ListNode();
        head.val = a2[1];


        ListNode l2 = new ListNode();
        l2.val = a2[0];
        l2.next = head;
        for (int i = 2; i < a2.length; i++) {
            ListNode node = new ListNode();
            node.val = a2[i];
            head.next = node;
            head = node;
        }


        Solution s = new Solution();
        ListNode sum = s.addTwoNumbers(l1, l2);

        while (sum != null) {
            System.out.println(" " + sum.val);
            sum = sum.next;
        }
    }
}

