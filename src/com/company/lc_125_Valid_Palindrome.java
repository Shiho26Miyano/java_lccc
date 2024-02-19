package com.company;

public class lc_125_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                System.out.println(s.charAt(i));
                System.out.println("above i");
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                System.out.println(s.charAt(j));
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }

        return true;
    }
    public static void main(String[] args){
        //String[] x = new String[] {"flower","filow","floight"};
        String y = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(y));
        //longestCommonPrefix(x);
    }
}
