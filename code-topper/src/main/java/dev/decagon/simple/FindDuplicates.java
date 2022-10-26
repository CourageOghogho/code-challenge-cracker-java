package dev.decagon.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    //find duplicates with hashmap and order O(n)
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,2,3,4,5,6,6,7,8,9,10};

        Map<Integer, Integer> myMap=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            int item=arr[i];
            if(myMap.containsValue(item)){
                result.add(item);
            }else
                myMap.put(item,item);
        }

        Arrays.sort(arr);
        result.forEach(System.out::println);
    }

}
