package com.company;
import java.util.*;

public class lc_17_Letter_Combinations_of_a_Phone_Number {
    public static List<String> letterCombinations(String digits) {
        // the purpose of the question is using stack, while length of element in the ans == i , element is poll() and element + mapping[i] all possibilities
        // 用过就扔t，
        LinkedList<String> ans = new LinkedList<String>();
        int L = digits.length();
        if (L == 0) return ans;
        ans.add("");
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for(int i =0; i<digits.length();i++){
            //loop each single number in the input string
            int x = Character.getNumericValue(digits.charAt(i));
            // get the numeric value of each number
            while(ans.peek().length()==i){
                //
                String t = ans.poll();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
                //every combination.legnth() should be == di
            }
        }
        return ans;
    }


    public static void main(String[] args){
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String strA= "23";
        List<String> result = letterCombinations(strA);
        System.out.println(result);
        //practice
        LinkedList<Character> ans = new LinkedList<Character>();
        for (char s : mapping[2].toCharArray())
            ans.add(s);
        //System.out.println(ans);

    }

}
