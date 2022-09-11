package com.company;
import java.util.*;


public class lc_271_Encode_and_Decode_Strings {

    // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            sb.append(s.length()).append('/').append(s);
        }
        System.out.println(sb);
        return sb.toString();

    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> ret = new ArrayList<>();
        int i = 0;
        while (i < s.length()){
            //StringName.IndexOf(char, startingPosition);
            int slash = s.indexOf('/', i);
            System.out.println(s.substring(i,slash));
            int size = Integer.valueOf(s.substring(i, slash));
            i = slash + size + 1;
            ret.add(s.substring(slash + 1, i));

        }
        return ret;

    }

    public static void main(String[] args){
        String[] stringList = new String[]{"Hello","World"};
        List<String> messages = Arrays.asList("Hello", "World");
        int[] nums2 = new int[]{2,4,1,1,3};
        String text = "abbccaa";
        int val = 12;
        int ladders = 1;

        System.out.println(messages);
        //String result =  encode(stringList);
        //System.out.println(Arrays.toString(result));
        //System.out.println(result);
    }
}
