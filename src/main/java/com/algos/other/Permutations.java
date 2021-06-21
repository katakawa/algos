package com.algos.other;

public class Permutations {

    public static void main(String[] args) {
        permutations("ab", "abcdabddabbaccccbaab");
    }

    private static void permutations(String a, String b) {
        String searchedStringA = a;
        String foundInB = "";
        for (int i = 0; i < b.length(); i++) {
            String bChar = String.valueOf(b.charAt(i));


            if (searchedStringA.contains(bChar)) {
                searchedStringA = searchedStringA.substring(0, searchedStringA.indexOf(bChar)) + searchedStringA.substring(searchedStringA.indexOf(bChar) + 1);
                foundInB += bChar;
            }
            if (searchedStringA.isEmpty()) {
                System.out.println(foundInB);
                searchedStringA = a;
                foundInB = "";
            }
        }
    }

}
