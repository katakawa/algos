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

        int repeated = 0;
        boolean newSymbol = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (i == str.length() - 1) {
                if (c == str.charAt(i - 1)) {
                    newString.append(c);
                    repeated++;
                    newString.append(repeated);
                } else {
                    newString.append(c);
                    repeated++;
                    newString.append(repeated);
                }
                continue;
            }


            if (c == str.charAt(i + 1)) {
                repeated++;
            } else {
                newString.append(c);
                repeated++;
                newString.append(repeated);
                repeated = 0;
            }
        }

        return newString.toString();
    }
}
