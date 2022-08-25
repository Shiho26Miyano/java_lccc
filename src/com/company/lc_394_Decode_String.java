package com.company;
import java.util.*;

public class lc_394_Decode_String {
    private static int idx;

    public static String decodeString(String s) {
        idx = 0;
        return helper(s);
    }

    private static  String helper(String s) {
        StringBuilder ans = new StringBuilder();
        int repeat = 0;
        while (idx < s.length()) {
            char ch = s.charAt(idx);
            if (ch == ']') {
                return ans.toString();
            } else if (ch == '[') {
                idx++;
                String str = helper(s);
                while (repeat > 0) {
                    ans.append(str);
                    repeat--;
                }
            } else if (Character.isDigit(ch)) {
                repeat = repeat * 10 + ch - '0';
            } else {
                ans.append(ch);
            }
            idx++;
        }
        return ans.toString();
    }
    // recursion practice
    public static int sum(int k){
        if (k > 0){
            return k + sum(k - 1);
        } else{
            return 0;
        }
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{0,1,2,4,5,7};
        //int[] nums2 = new int[]{2,2,3};
        int val = 2;
        int ladders = 1;
        String stringA = "3[a]2[bc]";
        String result = decodeString(stringA);
        //System.out.println(Arrays.toString(result));
        System.out.println((result));


        int test = sum(3);
        System.out.println(test);
    }



    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}
