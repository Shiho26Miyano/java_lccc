package com.company;
import java.io.*;
import java.util.*;
// The charAt() method returns the character at the specified index in a string.
// public char charAt(int index)

//20230718
public class lc_20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String x = "[{}]()[]";
        System.out.println(isValid(x));

    }
}