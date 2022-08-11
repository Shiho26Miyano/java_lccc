package com.company;
import java.util.*;;

public class lc_253_Meeting_Rooms_II {
    public static int minMeetingRooms(int[][] intervals) {
        //I use the meeting's end time as the room indicate and put them into a heap
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < intervals.length; i++) {
            if (rooms.isEmpty()) {
                rooms.add(intervals[i][1]);
            } else {
                if (rooms.peek() > intervals[i][0]) {
                    //if the room that becomes available the earliest still cannot accommodate this new meeting, then we'll have to add a new room
                    rooms.add(intervals[i][1]);
                } else {
                    //otherwise, we'll just update the room that finishes the earliest with the new finish time.
                    rooms.poll();
                    rooms.add(intervals[i][1]);
                }
            }
        }
        return rooms.size();
    }

    public static void main(String[] args){
        int[][] intArray = new int[][]{{0, 30}, {5, 10}, (15, 20)};
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
