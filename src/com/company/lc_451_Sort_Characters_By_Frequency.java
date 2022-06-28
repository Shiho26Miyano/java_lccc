package com.company;
import java.util.*;
public class lc_451_Sort_Characters_By_Frequency {
    public static String frequencySort(String s) {
        int[] map = new int[256];
        for (char c: s.toCharArray()) map[c]++;
        List<Character>[] bucket = new List[s.length() + 1];
        for (int i=0; i<256; i++) {
            int freq = map[i];
            if (freq != 0) {
                if (bucket[freq] == null) bucket[freq] = new LinkedList<>();
                bucket[freq].add((char) i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=bucket.length-1; i>=0; i--) {
            List<Character> list = bucket[i];
            if (list != null) {
                for (Character c: list) {
                    char[] chars = new char[i];
                    Arrays.fill(chars, c);
                    sb.append(chars);
                }
            }
        }

        return sb.toString();
    }
    public static void main(String[] args){
        int[] intArray = new int[]{2,2,5,5,5,5,2,6,3,4,2,5,6,7};
        int target = 2;
        String s = "tree";
        String result = frequencySort(s);
        System.out.println(result);
    }

}
