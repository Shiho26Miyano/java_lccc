package com.company;

public class lc_9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int y = x;
        int result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result == y;
    }




    public static void main(String[] args){
        //String s = "addccggazfeezddh";
        //int[] nums2 = new int[]{2,2,3};
        int target = 676;
       //char[] t = new char[]{'h','e','l','l','o'};
        boolean t = isPalindrome(target);
        System.out.println(t);
    }


}
