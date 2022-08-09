package com.company;
import java.util.*;;

public class lc_448_Find_All_Numbers_Disappeared_in_an_Array {
    //hashmap
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Boolean> hashTable = new HashMap<Integer, Boolean>();

        for (int i = 0; i < nums.length; i++) {
            hashTable.put(nums[i], true);
        }

        List<Integer> result = new LinkedList<Integer>();

        for (int i = 1; i <= nums.length; i++) {
            if (!hashTable.containsKey(i)) {
                result.add(i);
            }
        }

        return result;
    }
    //hashset
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        Set<Integer> havSet = new HashSet();
        for (int i = 0; i < nums.length; i++){
            havSet.add(nums[i]);
        }

        List<Integer> result = new LinkedList<Integer>();

        for (int i = 1; i <= nums.length; i++) {
            if (!havSet.contains(i)) {
                result.add(i);
            }
        }

        return result;

    }
    // temp int[]
    public List<Integer> findDisappearedNumbers3(int[] nums) {
        int[] tmp = new int[nums.length + 1];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            tmp[nums[i]] = nums[i];
        }
        for (int i = 1; i < tmp.length; i++) {
            if(tmp[i] == 0) result.add(i);
        }
        return result;

    }
    public static void main(String[] args){
        int[] intArray = new int[]{4,3,2,7,8,2,3,1};
        int target = 5;
        List<Integer> result =  findDisappearedNumbers(intArray);
        System.out.println((result));
    }
}
