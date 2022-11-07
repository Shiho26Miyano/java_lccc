package com.company;
import java.util.*;;


public class lc_1268_Search_Suggestions_System {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        //ceilingKey() call returns the least key greater than or equal to key or null if there is no such key
        //floorKey() call returns the greatest key less than or equal to key, or null if there is no such key.
        //Use method Arrays.asList we can convert from an array to a fixed-size List object.
        //This List is just a wrapper that makes the array available as a list. No data is copied or created.
        //ArrayList class is a resizable array, which can be found in the java.util package.
        //TreeMap is sorted according to the natual ordering of its keys.
        //toCharArray(): returns a newly allocated character array.
        //1.sort Arrays products as lexicographically order
        //2.convert products Arrays to a fixed-size List object
        //3.create answer ArrayList res, create empty TreeMap map
        //4.fille the empty TreeMap k/v: products[i], i
        //

        Arrays.sort(products);
        List<String> productsList = Arrays.asList(products);
        List<List<String>> res = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < products.length; i++){
            map.put(products[i], i);
        }
        String key = "";

        for (char c : searchWord.toCharArray()){
            key += c;
            String ceilingKey = map.ceilingKey(key);
            System.out.println(" Key is " + key);
            System.out.print("ceilingKey is " + ceilingKey);
            String floorKey = map.floorKey(key + "~");
            System.out.print("floorKey is " + floorKey);
            if (ceilingKey == null || floorKey == null) break;
            res.add(productsList.subList(map.get(ceilingKey), Math.min(map.get(ceilingKey) + 3, map.get(floorKey) + 1)));
        }
        while(res.size() < searchWord.length()) res.add(new ArrayList<>());
        return res;
    }


    public static void main(String args[])
    {

        // create an empty TreeMap
        TreeMap<Integer, String>
                numMap = new TreeMap<Integer, String>();

        // Insert the values
        numMap.put(6, "Six");
        numMap.put(1, "One");
        numMap.put(5, "Five");
        numMap.put(3, "Three");
        numMap.put(8, "Eight");
        numMap.put(10, "Ten");

        // Print the Values of TreeMap
        System.out.println("TreeMap: " + numMap.toString());

        try {
            // Passing null as parameter to floorKey()
            // This will throw exception
            System.out.println(numMap.floorKey(null));
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println(numMap.floorKey(7));

        for (Map.Entry<Integer, String> entry : numMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }
    }
}


