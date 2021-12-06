package com.company;

import java.util.HashMap; // import the HashMap class
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class lc_001_two_sum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> run_map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (run_map.containsKey(target - x)) {
                return new int[]{run_map.get(target - x), i};
            }

            run_map.put(x, i);
            System.out.println(run_map);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    //Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
    public static void MapCat() {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + capitalCities);
        // Displaying key/value pair
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // Checking for the key_element "USA"
        System.out.println(capitalCities.containsKey("USA"));
        // Display value of key_element "USA"
        System.out.println(capitalCities.get("USA"));
    }

    public static void main(String[] args){
        int[] intArray = new int[]{2,2,5,2,6,3,4,5,6,7};
        int target = 5;
        int[] result = twoSum(intArray, target);
        System.out.println(Arrays.toString(result));
        // test MapCat
        MapCat();
    }
}

//my fking Java lc