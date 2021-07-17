package com.algos.arraysandstrings;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        List res = Arrays.asList(merge(new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3));
        for (Object ress : res) {
            System.out.println(ress);
        }
    }

    private static int[] merge(int[] nums1, int pointerFirst, int[] nums2, int pointerSecond) {
        pointerFirst--;
        pointerSecond--;

        for (int i = pointerFirst + pointerSecond + 1; i >= 0; i--) {
            int numArr1 = pointerFirst >= 0 ? nums1[pointerFirst] : Integer.MIN_VALUE;
            int numArr2 = pointerSecond >=  0 ? nums2[pointerSecond] : Integer.MIN_VALUE;

            if (numArr1 > numArr2) {
                nums1[i] = numArr1;
                pointerFirst--;
            }
            else {
                nums1[i] = numArr2;
                pointerSecond--;
            }
        }
        return nums1;
    }
}