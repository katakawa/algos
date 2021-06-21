package com.algos.other;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        List <String> result = new LinkedList<>();
        if(digits.isEmpty() || digits == null) {
            return  result;
        }

        Map<Character, String> digitsToCharMapping = new HashMap<>();
        digitsToCharMapping.put('2', "abc");
        digitsToCharMapping.put('3', "def");
        digitsToCharMapping.put('4', "ghi");
        digitsToCharMapping.put('5', "jkl");
        digitsToCharMapping.put('6', "mno");
        digitsToCharMapping.put('7', "pqrs");
        digitsToCharMapping.put('8', "tuv");
        digitsToCharMapping.put('9', "wxyz");

        getLetterCombinationsUtil(digits,digitsToCharMapping,result,"");

        return result;


    }


    public void getLetterCombinationsUtil (String digits, Map<Character, String> digitsToCharMapping , List<String> result, String intermediateText ){
        if (digits.isEmpty()){
            if (intermediateText != null){
                result.add(intermediateText);
                return;
            }
        }

        String characterMapping  = digitsToCharMapping.get(digits.charAt(0));
        String tmp = intermediateText;
        for(int i = 0 ; i < characterMapping.length(); i++){
            tmp += characterMapping.charAt(i);
            getLetterCombinationsUtil(digits.substring(1), digitsToCharMapping, result, tmp);
            tmp = intermediateText;
        }
    }
}
