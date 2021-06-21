package com.algos.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AllSubsets {

    public static void main(String[] args) {
        List<ArrayList<Integer>> list = getSubsets(List.of(1, 2, 3), 0);
        System.out.println(list);
    }


    private static List<ArrayList<Integer>> getSubsets(List<Integer> set, int index) {
        List<ArrayList<Integer>> allsubsets;
        if (set.size() == index) { //Base case - add empty set
            allsubsets = new ArrayList<>();
            allsubsets.add(new ArrayList<>()); // Empty set
        } else {
            allsubsets = getSubsets(set, index + 1);
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<>();
            for (ArrayList<Integer> subset : allsubsets) {
                ArrayList<Integer> newsubset = new ArrayList<>();
                newsubset.addAll(subset); //
                newsubset.add(item);
                moresubsets.add(newsubset);
            }
            allsubsets.addAll(moresubsets);
        }
        return allsubsets;
    }

}
