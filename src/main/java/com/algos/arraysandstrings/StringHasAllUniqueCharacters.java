package com.algos.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Determine if a string has all unique characters
 *
 *
 * https://stackoverflow.com/questions/19212306/whats-the-difference-between-ascii-and-unicode
 * https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/ASCII-Table-wide.svg/875px-ASCII-Table-wide.svg.png
 */
public class StringHasAllUniqueCharacters {

    public static void main(String[] args) {
        //System.out.println(allCharactersAreUnique("abcad"));
        //System.out.println(isUniqueChars("abcad"));
        System.out.println(1 << 1);
        System.out.println(1 << 2);
        System.out.println(1 << 3);
        System.out.println(1 << 4);
    }

    private static boolean allCharactersAreUnique(String str) {
        boolean[] chars = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (chars[symbol]) {
                return false;
            }
            chars[symbol] = true;
        }
        return true;
    }

    private static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

}
