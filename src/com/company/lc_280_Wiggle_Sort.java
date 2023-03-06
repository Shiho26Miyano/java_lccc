package com.company;
import java.util.*;

public class lc_280_Wiggle_Sort {
    public void wiggleSort(int[] nums) {

        for (int i = 0; i < nums.length; i++){
            if(i%2 == 1){
                if ((nums[i - 1] > nums[i])){
                    swap(nums, i);
                }

            } else if (i != 0 && nums[i - 1] < nums[i]){
                swap(nums, i);
            }

        }
    }
    public void swap(int[] nums, int i){
        int tmp=nums[i];
        nums[i]=nums[i - 1];
        nums[i-1]=tmp;
    }
}
