package com.company;
import java.util.*;
//首先遍历整个数组，并使用哈希表记录每个数字出现的次数，并形成一个「出现次数数组」。找出原数组的前 kk 个高频元素，就相当于找出「出现次数数组」的前 kk 大的值。
//最简单的做法是给「出现次数数组」排序。但由于可能有 O(N)O(N) 个不同的出现次数（其中 NN 为原数组长度），故总的算法复杂度会达到 O(N\log N)O(NlogN)，不满足题目的要求。
//在这里，我们可以利用堆的思想：建立一个小顶堆，然后遍历「出现次数数组」：
//如果堆的元素个数小于 kk，就可以直接插入堆中。
//如果堆的元素个数等于 kk，则检查堆顶与当前出现次数的大小。如果堆顶更大，说明至少有 kk 个数字的出现次数比当前值大，故舍弃当前值；否则，就弹出堆顶，并将当前值插入堆中。
//遍历完成后，堆中的元素就代表了「出现次数数组」中前 kk 大的值。


public class lc_347_Top_K_Frequent_Elements {
    public static int[] topKFrequent(int[] nums, int k) {
        // O(1) time
        if (k == nums.length) {
            return nums;
        }
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] m, int[] n){
                return m[1] - n[1];
            }
        });

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            int num = entry.getKey(), cnt = entry.getValue();
            if(queue.size() == k){
                if(cnt > queue.peek()[1]){
                    queue.poll();
                    queue.offer(new int[]{num, cnt});
                }
            }else{
                queue.offer(new int[]{num, cnt});
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = queue.poll()[0];
        }
        return res;
    }


    public static void main(String[] args){
        int[] intArray = new int[]{2,2,5,5,5,5,2,6,3,4,2,5,6,7};
        int target = 2;
        int[] result = topKFrequent(intArray, target);
        System.out.println(Arrays.toString(result));
    }

}
