package com.company;
import java.util.*;;


public class lc_409_Longest_Palindrome {
    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int res = 0;
        boolean hasOdd = false;
        for (int i: map.values()) {
            if (i % 2 == 0) {
                res += i;
            } else {
                res += i - 1;
                hasOdd = true;
            }
        }
        return res + (hasOdd ? 1 : 0);
    }

    public static void main(String[] args){
        int[][] intArray = new int[][]{{0, 30}, {5, 10}, {15, 20}};
        int target = 19;
        String input = "abccccdd";
        int result = longestPalindrome(input);

        System.out.println(result);
    }
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}
