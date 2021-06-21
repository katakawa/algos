package com.algos.leetcode;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 */
public class StringToInteger {

    public static void main(String[] args) {
        int a = 0;
        System.out.println(++a);
        System.out.println(myAtoi("12345"));
    }

    public static int myAtoi(String str) {
        int i = 0;
        int sign = 1;
        int result = 0;
        if (str.length() == 0) return 0;

        //Discard whitespaces in the beginning
        while (i < str.length() && str.charAt(i) == ' ') i++;

        // Check if optional sign if it exists
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) sign = (str.charAt(i++) == '-') ? -1 : 1;

        // Build the result and check for overflow/underflow condition
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (str.charAt(i++) - '0');
        }
        return result * sign;
    }
}
