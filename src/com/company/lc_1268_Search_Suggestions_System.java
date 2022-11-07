package com.company;
import java.util.*;;


public class lc_1268_Search_Suggestions_System {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        Arrays.sort(products);
        List<String> productsList = Arrays.asList(products);

        for (int i = 0; i < products.length; i++) {
            map.put(products[i], i);
        }
        
        String key = "";
        for (char c : searchWord.toCharArray()) {
            key += c;
            String ceiling = map.ceilingKey(key);
            String floor = map.floorKey(key + "~");
            if (ceiling == null || floor == null) break;
            res.add(productsList.subList(map.get(ceiling), Math.min(map.get(ceiling) + 3, map.get(floor) + 1)));
        }
        while (res.size() < searchWord.length()) res.add(new ArrayList<>());
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


