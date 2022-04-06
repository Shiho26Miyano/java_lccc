package com.company;
import java.util.*;

public class lc_856_score_of_parentheses {
    public static int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack();
        int score = 0; // The score of the current frame

        for (char c: S.toCharArray()) {
            if (c == '('){
                stack.push(score);
                score = 0;
            }
            else {
                score = stack.pop() + Math.max(score*2, 1);
            }
        }

        return score;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{2,7,11,15};
        int target = 9;
        String t = "(()(()))";
        int result = scoreOfParentheses(t);
        //System.out.println(Arrays.toString(result));
        System.out.println(result);
    }

}
