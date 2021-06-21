package com.algos.recursion;

import java.util.StringTokenizer;

public class StringPermutations {

    public static void main(String[] args) {
        permutation("", "abc");
    }

    /**
     * n! complexity
     * Loop until a full prefix is created
     * Loop for each index, permutate symbols at each index, which means
     * Pick characters for each "slot"
     *
     * Complexity:
     * n! leaves in total
     * Each leaf is attached to a path of length n
     * no more than n * n! nodes (function calls) in the tree
     * each node takes n work
     *
     * How many times does permutation get called before its base case?
     * n * n!
     * Therefore,we know there will be no more than nHow long does each function call take?
     * n
     *
     * n^2 * n!
     * @param prefix
     * @param str
     */
    private static void permutation(String prefix, String str) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String nextPrefix = prefix + str.charAt(i);
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(nextPrefix, rem);
            }
        }
    }
}
