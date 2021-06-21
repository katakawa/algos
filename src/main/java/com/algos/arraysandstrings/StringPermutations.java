package com.algos.arraysandstrings;

/**
 * Find all permutations of a string
 * O(n!) complexity
 */
public class StringPermutations {

    public static void main(String[] args) {
        stringPermutations("", "abc");
    }

    private static void stringPermutations(String prefix, String suffix) {
        if (suffix.equals("")) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < suffix.length(); i++) {
            String newPrefix = prefix + suffix.charAt(i);
            String newSuffix =  suffix.substring(0, i) + suffix.substring(i + 1);
            stringPermutations(newPrefix, newSuffix);
        }
    }
}
