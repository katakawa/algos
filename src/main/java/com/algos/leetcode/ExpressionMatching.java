package com.algos.leetcode;

/**
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*' where:
 *     '.' Matches any single character.​​​​
 *     '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 */
public class ExpressionMatching {

    public static void main(String[] args) {

    }

    /**
     * aa
     * a*
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {

        int i = 0;
        int j = 0;
        while (true) {
            char a = s.charAt(i);
            char b = p.charAt(j);

            if (a == b) {

            }
        }
    }
}
