package com.company;

public class lc_1539_Kth_Missing_Positive_Number {
    public static int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int pivot = left + (right - left) / 2;
               if (arr[pivot] - pivot - 1 < k) {
                left = pivot + 1;

            } else {
                right = pivot - 1;
            }
        }

        return left + k;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{3, 6, 7, 11};
        int target = 8;
        int result = findKthPositive(intArray, target);
        System.out.println((result));
    }
}
