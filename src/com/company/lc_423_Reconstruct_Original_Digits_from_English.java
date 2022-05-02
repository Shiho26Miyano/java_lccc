package com.company;
import java.util.*;

public class lc_423_Reconstruct_Original_Digits_from_English {
    public static String originalDigits(String s) {
        // building hashmap letter -> its frequency
        char[] count = new char[26 + (int)'a'];
        for(char letter: s.toCharArray()) {
            count[letter]++;
        }

        // building hashmap digit -> its frequency
        int[] out = new int[10];
        // letter "z" is present only in "zero"
        out[0] = count['z'];
        // letter "w" is present only in "two"
        out[2] = count['w'];
        // letter "u" is present only in "four"
        out[4] = count['u'];
        // letter "x" is present only in "six"
        out[6] = count['x'];
        // letter "g" is present only in "eight"
        out[8] = count['g'];
        // letter "h" is present only in "three" and "eight"
        out[3] = count['h'] - out[8];
        // letter "f" is present only in "five" and "four"
        out[5] = count['f'] - out[4];
        // letter "s" is present only in "seven" and "six"
        out[7] = count['s'] - out[6];
        // letter "i" is present in "nine", "five", "six", and "eight"
        out[9] = count['i'] - out[5] - out[6] - out[8];
        // letter "n" is present in "one", "nine", and "seven"
        out[1] = count['o'] - out[0] -  out[2] - out[4];

        System.out.println(Arrays.toString(out));
        // building output string
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < 10; i++)
            for (int j = 0; j < out[i]; j++)
                output.append(i);
        return output.toString();
    }
    public static void main(String[] args){
        //int[] intArray = new int[]{3, 6, 9,11,21};
        //int target =5;
        String s = "owoztneoer";
        String result = originalDigits(s);
        System.out.println((result));
    }


}
