package com.company;
import java.util.*;;

public class lc_253_Meeting_Rooms_II {
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // Sort the intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Use a min heap to track the minimum end time of merged intervals
        PriorityQueue<int[]> heap = new PriorityQueue<>(intervals.length, (a, b) -> a[1] - b[1]);


        // start with the first meeting, put it to a meeting room
        //print2D(intervals);
        //System.out.println(Arrays.toString(intervals[0]));
        heap.offer(intervals[0]);
        //System.out.println(Arrays.deepToString(heap.toArray()));

        for (int i = 1; i < intervals.length; i++) {
            // get the meeting room that finishes earliest
            int[] interval = heap.poll();

            if (intervals[i][0] >= interval[1]) {
                // if the current meeting starts right after
                // there's no need for a new room, merge the interval
                interval[1] = intervals[i][1];
            } else {
                // otherwise, this meeting needs a new room
                heap.offer(intervals[i]);
            }

            // don't forget to put the meeting room back
            heap.offer(interval);
        }
        System.out.println(Arrays.deepToString(heap.toArray()));
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
