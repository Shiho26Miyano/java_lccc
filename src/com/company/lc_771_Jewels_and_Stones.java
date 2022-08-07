package com.company;
import java.util.*;


public class lc_771_Jewels_and_Stones {
    public static int numJewelsInStones(String J, String S) {
        Set<Character> Jset = new HashSet();
        for (char j: J.toCharArray())
            Jset.add(j);

        int ans = 0;
        for (char s: S.toCharArray())
            if (Jset.contains(s))
                ans++;
        return ans;
    }
    public static int numJewelsInStones2(String J, String S) {
        int ans = 0;
        for(int i=0;i<S.length();i++)
        {
            int x = J.indexOf(S.charAt(i));

            if(x!=-1)
                ans++;

        }
        return ans;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,2,2,3,1};
        int target = 5;
        String str1 = "abcda";
        String str2 = "abcdab";
        int result =   numJewelsInStones(str1, str2);
        int result2 =   numJewelsInStones2(str1, str2);
        System.out.println((result));
        System.out.println((result2));
    }
}
