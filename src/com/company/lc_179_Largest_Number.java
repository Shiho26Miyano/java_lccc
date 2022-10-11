package com.company;
import java.util.*;

public class lc_179_Largest_Number {
    public String largestNumber(int[] nums) {
        String[] numStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) numStr[i] = String.valueOf(nums[i]);
        // Integer.toString(nums[i]) is slower
        //Arrays.sort(numStr, (o1, o2) -> (o2.concat(o1)).compareTo(o1.concat(o2)));
        // lambda is much slower
        Arrays.sort(numStr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2, s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });

        if (numStr[0].equals("0")) return "0";
        StringBuilder res = new StringBuilder(); // use StringBuilder to concact
        for (String str : numStr) res.append(str);
        return res.toString();
    }
}
