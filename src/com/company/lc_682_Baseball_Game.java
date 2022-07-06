package com.company;
import java.util.*;

public class lc_682_Baseball_Game {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();

        for(String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for(int score : stack) ans += score;
        return ans;
    }
    public static void main(String[] args){
        String[] sArray = new String[]{"5", "2", "C", "D", "+"};
        int target = 2;
        String s = "tree";
        int result =calPoints(sArray);
        System.out.println(result);
    }

}
