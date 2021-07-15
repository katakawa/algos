package com.algos.arraysandstrings;

import java.util.Arrays;

/**
 * Replace spaces in a string
 */
public class ReplaceSpaces {

    public static void main(String[] args) {
        System.out.println(replaceSpaces("a b cdef "));
        System.out.println(replaceSpacesUsingChars("a b cdef   "));
    }

    private static String replaceSpaces(String input) {

        char[] chars = input.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                stringBuilder.append(input.charAt(i));
            } else {
                stringBuilder.append("%20");
            }
        }
        return stringBuilder.toString();
    }

    private static String replaceSpacesUsingChars(String input) {
        char[] inputChars = input.toCharArray();

        int newArraySize = 0;
        int charsInInput = 0;

        for (int i = inputChars.length - 1; i >= 0; i--) {
            if (newArraySize == 0 && inputChars[i] == ' ') continue;
            if (inputChars[i] == ' ') newArraySize += 3;
            else newArraySize++;
            charsInInput++;
        }

        char[] replacedChars = new char[newArraySize];

        int filledChars = 0;

        for (int i = 0; i < charsInInput; i++) {
            if (input.charAt(i) != ' ') {
                replacedChars[filledChars] = input.charAt(i);
                filledChars++;
            } else {
                replacedChars[filledChars] = '%';
                filledChars++;
                replacedChars[filledChars] = '2';
                filledChars++;
                replacedChars[filledChars] = '0';
                filledChars++;
            }
        }

        return Arrays.toString(replacedChars);
    }
}
