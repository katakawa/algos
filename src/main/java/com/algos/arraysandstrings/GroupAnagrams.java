package com.algos.arraysandstrings;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] inputStrings) {
        if (inputStrings.length == 0) return new ArrayList();

        Map<String, List<String>> answer = new HashMap<>();

        for (String oneString : inputStrings) {
            char[] ca = oneString.toCharArray();

            Arrays.sort(ca);
            String key = String.valueOf(ca);

            if (!answer.containsKey(key)) answer.put(key, new ArrayList());
            answer.get(key).add(oneString);
        }

        return new ArrayList(answer.values());
    }
}