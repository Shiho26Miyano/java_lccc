package com.company;
import java.util.*;

public class lc_541_Reverse_String_II {
    public static String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }

    public static void main(String[] args){
        int[] intArray = new int[]{-4,-1,0,3,10};
        String s = "abcdefg";
        int p = 2;
        System.out.println(reverseStr(s, p));
    }
}
