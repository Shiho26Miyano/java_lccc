package com.company;
import java.io.*;
import java.util.*;
// The charAt() method returns the character at the specified index in a string.
// public char charAt(int index)
public class lc_20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> run_stack = new Stack<Character>();
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put('(', ')');
        mappings.put('{', '}');
        mappings.put('[', ']');
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (mappings.containsKey(ch)) {
                run_stack.push(ch);
            }
            else if (run_stack.isEmpty() || mappings.get(run_stack.pop()) != ch) {
                return false;
            }
        }
        return run_stack.isEmpty();

    }

    public static void main(String[] args){
        String x = "[{}]()[]";
        System.out.println(isValid(x));

    }
}