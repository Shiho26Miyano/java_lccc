package com.company;
import java.util.*;

public class lc_905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{3,3,7,7,10,11,11};
        int p = 1;
        //int target =5;
        int[] result = sortArrayByParity(intArray);
        System.out.println(Arrays.toString(result));
    }
}
