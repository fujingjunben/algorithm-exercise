package com.bigdeal.leetcode.s141;

import com.bigdeal.model.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null) {
            return false;
        }
        Map<ListNode, Integer> data = new HashMap<>();

        ListNode node = head.next;
        while (node != null){
            if (data.containsKey(node)) {
                return true;
            } else{
                data.put(node, 1);
                node = node.next;
            }
        }
        return false;
    }
}
