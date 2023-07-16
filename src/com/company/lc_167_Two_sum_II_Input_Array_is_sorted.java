package com.company;
import java.util.*;

public class lc_167_Two_sum_II_Input_Array_is_sorted {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
            int complement = target - numbers[i];


            if (map.containsKey(complement)){
                return new int[]{map.get(complement) , i+1};
            }
            map.put(numbers[i], i + 1);

        }
        System.out.println(map);
        return null;


    }



    public static void main(String[] args){
        int[] intArray = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(intArray, target);
        System.out.println(Arrays.toString(result));
    }
}
