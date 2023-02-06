package com.company;
import java.util.*;

//backtracking
// Backtracking is an algorithm for finding all solutions by exploring all potential candidates.
// If the solution candidate turns to be not a solution (or at least not the last one),
// backtracking algorithm discards it by making some changes on the previous step, i.e. backtracks and then try again.

// to do
// define a backtrack function backtrack(first, curr_combination, nums arraylist)
// if the current combination is done, we will add the combination to the final output
// otherwise, we will iterate over the idexes i from first to the length of the entire sequence n
// add integer nums[i] into the current combination curr
// proceed to add more integers into the combination: backtrack(i + 1, curr)
// backtrack by removing nums[i] from curr.

public class lc_78_Subsets {
    List<List<Integer>> output = new ArrayList<>();
    int n, k;

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        // if the combination is done
        if (curr.size() == k) {
            output.add(new ArrayList(curr));
            return;
        }

        for (int i = first; i < n; i++){
            // add i into the current combination
            curr.add(nums[i]);
            // use next integers to complete the combination
            backtrack(i + 1, curr, nums);
            // backtrack
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums){
        n = nums.length;
        for (k = 0; k < n + 1; k++){
            backtrack(0, new ArrayList<Integer>(), nums);
        }
        return output;
    }
}
