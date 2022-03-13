package com.company;

public class lc_14_Longest_common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            System.out.println(c);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];

    }
    public static void main(String[] args){
        String[] x = new String[] {"flower","filow","floight"};
        System.out.println(longestCommonPrefix(x));
        //longestCommonPrefix(x);
    }
}
