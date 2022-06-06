package com.bigdeal.leetcode;

import java.util.*;

public class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        Map<String, String> successors = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!successors.containsKey(word)) {
                checkPrefix(word, dictionary, successors);
            }
            sb.append(successors.getOrDefault(word, word));
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    private void checkPrefix(String word, List<String> dictionary, Map<String, String> successors) {
        for (String root : dictionary) {
            if (word.startsWith(root)) {
                if (successors.containsKey(word)) {
                    String value = successors.get(word);
                    if (value.length() > root.length()) {
                        successors.put(word, root);
                    }
                } else {
                    successors.put(word, root);
                }
            }
        }
    }
}
