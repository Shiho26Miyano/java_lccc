package com.company;
import java.util.*;

public class lc_438_Find_All_Anagrams_in_a_String {

    public static List<Integer> findAnagrams(String s, String p) {
        int ns = s.length(), np = p.length();
        if (ns < np) return new ArrayList();
        int [] pCount = new int[26];
        int [] sCount = new int[26];
        for (char ch : p.toCharArray()) {
            pCount[(int)(ch - 'a')]++;
        }
        List<Integer> output = new ArrayList();
        for (int i = 0; i < ns; ++i) {
            sCount[(int)(s.charAt(i) - 'a')]++;
            if (i >= np) {
                sCount[(int)(s.charAt(i - np) - 'a')]--;
            }
            if (Arrays.equals(pCount, sCount)) {
                output.add(i - np + 1);
            }
        }
        return output;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{3,3,7,7,10,11,11};
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println (findAnagrams(s, p));
    }
}


