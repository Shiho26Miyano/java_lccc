package com.company;
import java.util.*;

public class lc_795_Number_of_Subarrays_with_Bounded_Maximum {
    public static int numSubarrayBoundedMax(int[] A, int L, int R) {
        return count(A, R) - count(A, L-1);
    }

    public static  int count(int[] A, int bound) {
        int ans = 0, cur = 0;
        for (int x: A) {
            if(x <= bound){
                cur++;
            }else{
                cur = 0;
            }
            ans += cur;
        }
        return ans;
    }

    public static void main(String[] args){
        int[] intArray = new int[]{2,1,4,3};
        String t = "abc";
        String f ="ahbgdc";

        System.out.println(count(intArray, 2));
    }
}
