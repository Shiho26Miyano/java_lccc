package com.company;
import java.util.*;

public class lc_394_Decode_String {

    public static String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> str = new Stack<>();

        int idx = 0;
        str.push("");

        while (idx < s.length()) {
            if (s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
                int start = idx;
                while (s.charAt(idx + 1) >= '0' && s.charAt(idx + 1) <= '9') {
                    idx++;
                }
                count.push(Integer.parseInt(s.substring(start, idx + 1)));
            } else if (s.charAt(idx) == '[') {
                str.push("");
            } else if (s.charAt(idx) == ']') {
                String st = str.pop();
                StringBuilder sb = new StringBuilder();
                int n = count.pop();
                for (int j = 0; j < n; j++) {
                    sb.append(st);
                }
                str.push(str.pop() + sb.toString());
            } else {
                str.push(str.pop() + s.charAt(idx));
            }

            idx++;
        }

        return str.pop();

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
