package com.algos.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();
        list.add(new String[] { "a" });
        String[] arr = list.get(0);
        System.out.println(arr[0]);
    }
}
