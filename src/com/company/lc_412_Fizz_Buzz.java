package com.company;
import java.util.*;;

public class lc_412_Fizz_Buzz {
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;
            if (isFizz && isBuzz) {
                res.add("FizzBuzz");
            } else if (isFizz) {
                res.add("Fizz");
            } else if (isBuzz) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[][] intArray = new int[][]{{0, 30}, {5, 10}, {15, 20}};
        int target = 19;
        List<String> result = fizzBuzz(3);

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
