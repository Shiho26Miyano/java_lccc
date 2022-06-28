package com.company;
import java.util.*;
public class lc_451_Sort_Characters_By_Frequency {
    public static String frequencySort(String s) {

        // Count up the occurances.
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Make a list of the keys, sorted by frequency.
        List<Character> characters = new ArrayList<>(counts.keySet());
        Collections.sort(characters, (a, b) -> counts.get(b) - counts.get(a));

        // Convert the counts into a string with a sb.
        StringBuilder sb = new StringBuilder();
        for (char c : characters) {
            int copies = counts.get(c);
            for (int i = 0; i < copies; i++) {
                sb.append(c);
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
