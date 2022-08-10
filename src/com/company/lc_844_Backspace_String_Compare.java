package com.company;
import java.util.*;;
public class lc_844_Backspace_String_Compare {
    public static boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public static String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
    public static void main(String[] args){
        int[] intArray = new int[]{4,3,2,7,8,2,3,1};
        int target = 19;
        String a = "ab#c";
        String b = "ad#c";
        boolean result = backspaceCompare(a,b);
        System.out.println((result));
    }
}
