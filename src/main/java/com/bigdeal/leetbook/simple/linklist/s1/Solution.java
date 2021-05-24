package com.bigdeal.leetbook.simple.linklist.s1;

import com.bigdeal.leetbook.simple.linklist.ListNode;

/**
 * delete node by value in linked list
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

    }
}
