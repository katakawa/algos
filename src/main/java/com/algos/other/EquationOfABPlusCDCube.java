package com.algos.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquationOfABPlusCDCube {

    public static void main(String[] args) {
        printSolutions();
    }

    private static void printSolutions() {
        Map<Integer, List<Integer>> preCalc = new HashMap<>();
        

        for (int i = 0; i < 1_00; i++) {
            for (int j = 0; j < 1_00; j++) {
                int result = (int) (Math.pow(i, 3) + Math.pow(j, 3));

                if (!preCalc.containsKey(result)) {
                    List<Integer> pair = new ArrayList<>();
                    preCalc.put(result, pair);
                }

                List<Integer> res = preCalc.get(result);
                res.add(i);
                res.add(j);
            }
        }

        for (int x = 0; x < 1_00; x++) {
            for (int y = 0; y < 1_00; y++) {
                int res = (int) (Math.pow(x, 3) + Math.pow(y, 3));
                if (preCalc.containsKey(res)) {
                    System.out.println(x);
                    System.out.println(y);
                    System.out.println(preCalc.get(res));
                    System.out.println("-----");
                }
            }
        }
    }

}
