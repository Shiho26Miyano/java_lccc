package com.company;
import java.util.*;;

public class lc_253_Meeting_Rooms_II {
    public static int minMeetingRooms(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, (a, b)->a[0] - b[0]);
        PriorityQueue<int[]> heap = new PriorityQueue<>(intervals.length, (a, b)->a[1] - b[1]);
        heap.offer(intervals[0]);

        for (int i = 1; i < intervals.length; i++){
            int[] minStart = heap.poll();

            if (intervals[i][0] >= minStart[1]){
                minStart[1] = intervals[i][1];
            }else{
                heap.offer(intervals[i]);
            }
            heap.offer(minStart);
        }
        return heap.size();
    }

    public static void main(String[] args){
        int[][] intArray = new int[][]{{0, 30}, {5, 10}, {15, 20}};
        int target = 19;
        int result =  minMeetingRooms(intArray);

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
