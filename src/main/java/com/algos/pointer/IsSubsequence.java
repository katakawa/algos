package com.algos.pointer;

public class IsSubsequence {

    public static void main(String[] args) {

    }

    // S if a subsequence of T
    private static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int pointerOne = 0;
        int pointerTwo = 0;

        while (pointerOne < s.length() && pointerTwo < t.length()) {
            if (s.charAt(pointerOne) == t.charAt(pointerTwo)) {
                pointerOne++;
            }
            pointerTwo++;
        }

        return pointerOne == s.length();
    }
}