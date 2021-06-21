package com.algos.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoArraysFindElementsWithDifferenceK {

    public static void main(String[] args) {
        List<int[]> result = findIntersectingElements(new int[] {7, 11}, new int[] {6, 9, 13, 15}, 2);
        System.out.println(result);
    }



    private static List<int[]> findIntersectingElements(int[] arrayA, int[] arrayB, int k) {
        Map<Integer, Integer> map2 = new HashMap<>();

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arrayB.length; i++) {
            map2.put(arrayB[i], arrayB[i]);
        }

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j <= k; j++) {
                if (map2.containsKey(arrayA[i] + j)) {
                    result.add(new int[] {arrayA[i], map2.get(arrayA[i] + j)});
                }
            }
            for (int j = 0; j >= -k; j--) {
                if (map2.containsKey(arrayA[i] + j)) {
                    result.add(new int[] {arrayA[i], map2.get(arrayA[i] + j)});
                }
            }
        }
        return result;
    }

}
