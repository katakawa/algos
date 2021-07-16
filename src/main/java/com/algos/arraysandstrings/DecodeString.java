package com.algos.arraysandstrings;

public class DecodeString {

    public static void main(String[] args) {
        System.out.println(parse("3[a2[c]]"));
    }

    private static String parse(String input) {
        char[] inputChars = input.toCharArray();
        String answer = "";

        for (int i = 0; i < inputChars.length; i++) {
            boolean isDigit = Character.isDigit(inputChars[i]);
            if (isDigit) {
                int repeat = inputChars[i] - 48;
                for (int j = 0; j < repeat; j++){
                    answer += parse(input.substring(i + 2, input.lastIndexOf((']'))));
                }
                i = input.indexOf(']') + 1;
            } else {
                answer += inputChars[i];
            }
        }
        return answer;
    }

}
