package com.algos.recursion;

import java.util.Arrays;
import java.util.List;

// Recursive implementation of
// word break problem in java
public class WordBreakProblem {


    // Word Break Problem Implementation in Java
    public static void main(String[] args) {
        // List of strings to represent a dictionary
        // we can also use a Trie or a set to store a dictionary
        List<String> dict = Arrays.asList("this", "th", "is", "famous",
                "Word", "break", "b", "r", "e", "a",
                "br", "bre", "brea", "ak", "problem");

        // input string
        String str = "Wordbreakproblem";

        // lookup array to store solutions to subproblems
        // `lookup[i]` stores if substring `str[n-i…n)` can be segmented or not
        int[] lookup = new int[str.length() + 1];
        Arrays.fill(lookup, -1);

        if (wordBreak(dict, str, lookup)) {
            System.out.print("The string can be segmented");
        }
        else {
            System.out.print("The string can't be segmented");
        }
    }

    // Function to determine if a string can be segmented into
    // space-separated sequence of one or more dictionary words
    public static boolean wordBreak(List<String> dict, String str, int[] lookup) {
        // `n` stores length of the current substring
        int length = str.length();

        // return true if the end of the string is reached
        if (length == 0) {
            return true;
        }

        // if the subproblem is seen for the first time
        if (lookup[length] == -1) {
            // mark subproblem as seen (0 initially assuming string
            // can't be segmented)
            lookup[length] = 0;

            for (int i = 1; i <= length; i++) {
                // consider all prefixes of the current string
                String prefix = str.substring(0, i);

                // if the prefix is found in the dictionary, then recur for the suffix
                if (dict.contains(prefix) && wordBreak(dict, str.substring(i), lookup)) {
                    // return true if the string can be segmented
                    lookup[length] = 1;
                    return true;
                }
            }
        }

        // return solution to the current subproblem
        return lookup[length] == 1;
    }
}