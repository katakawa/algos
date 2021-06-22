package com.algos.arraysandstrings;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeating("aabbccdd"));
    }


    private static char findFirstNonRepeating(String str) {
        char currentChar = str.charAt(0);
        boolean currentWasRepeated = false;

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                if (str.charAt(i) != str.charAt(i - 1)) {
                    return str.charAt(i);
                } else {
                    return ' ';
                }
            }
            if (str.charAt(i + 1) != currentChar && !currentWasRepeated) {
                return str.charAt(i);
            }
            if (str.charAt(i + 1) == currentChar) {
                currentWasRepeated = true;
            }
            if (str.charAt(i + 1) != currentChar) {
                currentWasRepeated = false;
            }
            currentChar = str.charAt(i + 1);
        }

        return ' ';
    }

}
