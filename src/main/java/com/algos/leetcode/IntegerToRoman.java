package com.algos.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Convert Integer to Roman
 */
public class IntegerToRoman {

    public static void main(String[] args) {
        String str = intToRoman(1994);
        System.out.println(str);
    }

    public static String intToRoman(int num) {

        StringBuilder stringBuilder = new StringBuilder();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        num = convertIter(num, 1000, stringBuilder, map);
        num = convert(num, 900, stringBuilder, map);
        num = convert(num, 500, stringBuilder, map);
        num = convert(num, 400, stringBuilder, map);
        num = convertIter(num, 100, stringBuilder, map);
        num = convert(num, 90, stringBuilder, map);
        num = convert(num, 50, stringBuilder, map);
        num = convert(num, 40, stringBuilder, map);
        num = convertIter(num, 10, stringBuilder, map);
        num = convert(num, 9, stringBuilder, map);
        num = convert(num, 5, stringBuilder, map);
        num = convert(num, 4, stringBuilder, map);
        num = convertIter(num, 1, stringBuilder, map);

        return stringBuilder.toString();

    }

    public static int convert(int num, int elem, StringBuilder stringBuilder, Map<Integer, String> map) {
        if (num >= elem) {
            num %= elem;
            stringBuilder.append(map.get(elem));
        }
        return num;
    }

    public static int convertIter(int num, int elem, StringBuilder stringBuilder, Map<Integer, String> map) {
        if(num >= elem) {
            int mRem = num / elem;
            num %= elem;
            for (int i = 0; i < mRem; i++) {
                stringBuilder.append(map.get(elem));
            }
        }
        return num;
    }

}
