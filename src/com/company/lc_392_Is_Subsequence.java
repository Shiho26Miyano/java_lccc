package com.company;
import java.util.*;

public class lc_392_Is_Subsequence {

    public static boolean isSubsequence(String s, String t) {
        Integer leftBound = s.length(), rightBound = t.length();
        Integer pLeft = 0, pRight = 0;

        while (pLeft < leftBound && pRight < rightBound) {
            // move both pointers or just the right pointer
            if (s.charAt(pLeft) == t.charAt(pRight)) {
                pLeft++;
            }
            pRight++;
        }
        return pLeft == leftBound;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{2,1,4,3};
        String t = "abc";
        String f ="ahbgdc";

        System.out.println(isSubsequence(t, f));
    }
}
