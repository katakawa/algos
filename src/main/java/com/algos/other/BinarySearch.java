package com.algos.other;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 11));
    }

    private static boolean binarySearch(int[] arr, int min, int max, int searchedElem) {
        int minMaxLength = min + max;
        int middle = minMaxLength / 2;
        int middleElem = arr[middle];

        if (middleElem == searchedElem) {
            return true;
        }
        if (min == max) {
            return false;
        }

        if (middleElem > searchedElem){
            max = middle;
            return binarySearch(arr, min, max - 1, searchedElem);
        } else {
            min = middle;
            return binarySearch(arr, min + 1, max, searchedElem);
        }
    }
}
