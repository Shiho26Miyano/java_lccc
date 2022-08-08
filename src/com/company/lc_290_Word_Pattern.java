package com.company;
import java.util.*;;

public class lc_290_Word_Pattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");

        //prevent out of boundary problem
        if(arr.length != pattern.length())
            return false;

        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){

            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                String value = map.get(c);
                if(!value.equals(arr[i]))  return false;
            }else if (map.containsValue(arr[i])) return false;
            map.put(c, arr[i]);
        }

        return true;
    }
    public static void main(String[] args){
        String[] strArray = new String[]{"gin", "zen", "gig", "msg"};
        int target = 5;
        String str1 = "abba";
        String str2 = "dog cat cat dog";
        boolean result =  wordPattern(str1, str2);
        System.out.println(result);
    }
}
