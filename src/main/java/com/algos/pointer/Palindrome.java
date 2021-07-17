package com.algos.pointer;

public class Palindrome {

    private static boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer <= rightPointer) {
           if (!Character.isLetterOrDigit(s.charAt(leftPointer)))
                leftPointer++;
            else if (!Character.isLetterOrDigit(s.charAt(rightPointer)))
                rightPointer--;
            else {
                if (Character.toLowerCase(s.charAt(leftPointer)) != Character.toLowerCase(s.charAt(rightPointer)))
                    return false;
                leftPointer++;
                rightPointer--;
            } 
        }

        return true;
    }
}
