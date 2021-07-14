package com.algos.arraysandstrings;

public class LongestNonRepeatingSubstring {

    public static void main(String[] args) {
        String str = "ab";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubsttr(str);
        System.out.println(len);
    }

    public static int longestUniqueSubsttr(String str) {
        int length = str.length();
        int longestSubstring = 0;

        for(int i = 0; i < length; i++) {
            boolean[] visited = new boolean[256];
            for(int j = i; j < length; j++) {
                if (visited[str.charAt(j)]) {
                    break;
                }
                else {
                    visited[str.charAt(j)] = true;
                    longestSubstring = Math.max(longestSubstring, j - i + 1);
                }
            }
            visited[str.charAt(i)] = false;
        }

        return longestSubstring;
    }
}