package com.algos.arraysandstrings;

/**
 * String Compression
 * aabccccaaa a2b1c5a3
 */
public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compress("aabbcc"));
    }

    private static String compress(String str){
        StringBuilder newString = new StringBuilder();

        char currentChar = str.charAt(0);
        int repeated = 1;

        for (int i = 1; i < str.length(); i++) {
            if (i == str.length() - 1) {
                if (str.charAt(i) == currentChar) {
                    repeated++;
                    newString.append(currentChar);
                    newString.append(repeated);
                } else {
                    newString.append(str.charAt(i));
                    newString.append(1);
                }
                break;
            }

            if (str.charAt(i) == currentChar) {
                repeated++;
            }
            else {
                newString.append(currentChar);
                newString.append(repeated);
                currentChar = str.charAt(i);
                repeated = 1;
            }


        }

        return newString.toString();
    }
}
