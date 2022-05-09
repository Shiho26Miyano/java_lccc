package com.company;
import java.util.*;

public class lc_359_Logger_Rate_Limiter {
    private LinkedList<Pair<String, Integer>> msgQueue;
    private HashSet<String> msgSet;

    /**
     * Initialize your data structure here.
     */
    public lc_359_Logger_Rate_Limiter() {
        msgQueue = new LinkedList<Pair<String, Integer>>();
        msgSet = new HashSet<String>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {


        // clean up.
        while (msgQueue.size() > 0) {
            Pair<String, Integer> head = msgQueue.getFirst();
            if (timestamp - head.second >= 10) {
                msgQueue.removeFirst();
                msgSet.remove(head.first);
            } else
                break;
        }

        if (!msgSet.contains(message)) {
            Pair<String, Integer> newEntry = new Pair<String, Integer>(message, timestamp);
            msgQueue.addLast(newEntry);
            msgSet.add(message);
            return true;
        } else
            return false;

    }

//NEED to test, not completed
}
class Pair<U, V> {
    public U first;
    public V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

