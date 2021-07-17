package com.algos.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    private static List<List<Integer>> generate(int levels) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < levels; i++) {
            List<Integer> currentLevel = new ArrayList<>();
            if (i == 0) {
                currentLevel.add(1);
                result.add(currentLevel);
                continue;
            }
            if (i == 1) {
                currentLevel.add(1);
                currentLevel.add(1);
                result.add(currentLevel);
                continue;
            }
            List<Integer> previousLevel = result.get(i - 1);
            for (int j = 0; j <= previousLevel.size(); j++) {
                if (j == 0 || j == (previousLevel.size())) {
                    currentLevel.add(1);
                    continue;
                }
                int newNode = 0;
                //1
                newNode = previousLevel.get(j - 1) + previousLevel.get(j);
                currentLevel.add(newNode);
            }
            result.add(currentLevel);

        }
        return result;
    }
}
