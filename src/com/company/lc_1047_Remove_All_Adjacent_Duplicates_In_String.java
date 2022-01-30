package com.company;
import java.util.*;

public class lc_1047_Remove_All_Adjacent_Duplicates_In_String {
    public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        int sbLength = 0;
        for(char character : S.toCharArray()) {
            if (sbLength != 0 && character == sb.charAt(sbLength - 1))
                sb.deleteCharAt(sbLength-- - 1);
            else {
                sb.append(character);
                sbLength++;
            }
        }
        return sb.toString();
    }


    public static void main(String[] args){
        String s = "addccggazfeezddh";
        //int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        String result =  removeDuplicates(s);
        System.out.println(result);
    }


}
