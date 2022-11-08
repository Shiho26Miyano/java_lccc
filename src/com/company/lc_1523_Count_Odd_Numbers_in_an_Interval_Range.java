package com.company;
import java.util.*;
public class lc_1523_Count_Odd_Numbers_in_an_Interval_Range {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
