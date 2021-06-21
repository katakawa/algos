package com.algos.arraysandstrings;

/**
 * One Away: There are three types of edits that can be performed on strings:
 *
 * insert a character,
 * remove a character,
 * replace a character.
 *
 * Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 */
public class OneEdit {

    public static void main(String[] args) {
        System.out.println(oneEditAway("abscs", "abcs"));
    }

    /**
     * Compare two strings
     * Only one difference can be spotted
     *
     * Char was inserted, next symbols are the same, 1st index is +1
     * Char was deleted, skip next element, 2nd symbol is +1
     * Char was changed, continue
     * Set flag every time
     *
     */
    private static boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditinsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditinsert(second, first);
        }
        return false;
        }

    private static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i= 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    /* Check if you can insert a character into s1 to make s2. */
    private static boolean oneEditinsert(String sl, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < s2.length() && index1 < sl.length()) {
            if (sl.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

}
