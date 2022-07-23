package com.company;
import java.util.*;

public class lc_17_Letter_Combinations_of_a_Phone_Number {
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.equals("")) {
            return ans;
        }
        String[] buttons = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for (char c : digits.toCharArray()) {
            String button = buttons[Integer.parseInt(c + "")];
            List<String> newList = new ArrayList<>();
            for (String str : ans) {
                for (char b : button.toCharArray()) {
                    newList.add(str + b);
                }
            }
            ans = newList;
        }
        return ans;


    }

    public static void main(String[] args){
        int[] intArray = new int[]{2,2,5,2,6,3,4,5,6,7};
        String strA= "23";
        List<String> result = letterCombinations(strA);
        System.out.println(result);
    }

}
