package com.bigdeal.leetcode.s141;

import com.bigdeal.model.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> data = new HashMap<>();
        while (head.next != null){
            ListNode next = head.next;
            if (data.containsKey(next)) {
                return true;
            } else{
                data.put(next, 1);
            }
        }
        return false;
    }
}
