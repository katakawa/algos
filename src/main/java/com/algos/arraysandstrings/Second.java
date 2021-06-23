package com.algos.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

public class Second {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {7, 4, -2, 4, -2, -9}));
    }

    public static int solution(int[] A) {
        List<Integer> currentSwitchingArray = new ArrayList<>();
        int longestSwitchingArray = 0;
        for (int i = 0; i < A.length; i++) {

            int elem = A[i];
            if (currentSwitchingArray.isEmpty() || currentSwitchingArray.size() == 1) {
                currentSwitchingArray.add(elem);
                continue;
            }
            if (currentSwitchingArray.size() % 2 == 0) {
                if (currentSwitchingArray.get(0) == elem) {
                    currentSwitchingArray.add(elem);
                    continue;
                } else {
                    longestSwitchingArray = Math.max(longestSwitchingArray, currentSwitchingArray.size());
                    i = i - 2;
                    currentSwitchingArray.clear();
                    //currentSwitchingArray.add(elem);
                    continue;
                }
            }
            if (currentSwitchingArray.size() % 2 != 0) {
                if (currentSwitchingArray.get(1) == elem) {
                    currentSwitchingArray.add(elem);
                    continue;
                } else {
                    longestSwitchingArray = Math.max(longestSwitchingArray, currentSwitchingArray.size());
                    i = i - 2;
                    currentSwitchingArray.clear();
                    //currentSwitchingArray.add(elem);
                    continue;
                }
            }
        }

        longestSwitchingArray = Math.max(longestSwitchingArray, currentSwitchingArray.size());

        return longestSwitchingArray;
    }
}
