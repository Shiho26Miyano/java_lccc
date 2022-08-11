package com.company;
import java.util.*;;

public class lc_268_Missing_Number {
    // hashset
    public static int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
    }

    // sort
    public static int missingNumber2(int[] nums) {
        Arrays.sort(nums);

        // Ensure that n is at the last index
        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        }
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }

        // If we get here, then the missing number is on the range (0, n)
        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i - 1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }

        // Array was not missing any numbers
        return -1;
    }

    public static void main(String[] args) {
        int[][] intArray = new int[][]{{0, 30}, {5, 10}, {15, 20}};
        int [] intArr= new int[] {3,0,1};
        int target = 19;
        int result = missingNumber(intArr);

        System.out.println(result);
    }

    public static void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}