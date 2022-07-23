package com.company;
import java.util.*;

public class lc_17_Letter_Combinations_of_a_Phone_Number {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        int L = digits.length();
        if (L == 0) return ans;

        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
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
