package dev.decagon;

import java.util.*;
import java.util.stream.Collectors;

public class Algo {
    public static Set testStream(){
        List<String> myList=new ArrayList<String>();

        myList.add("Courage");
        myList.add("Will");
        myList.add("Long");
        myList.add("Wak");
        myList.add("Courage");
        myList.add("Frank");
        myList.add("Frank");
        Set<String> uniques=new HashSet<>();
        Set<String> set=new HashSet<>();
        for (String string:myList
             ) {
            if(!uniques.add(string)){
                set.add(string);
            }
        }

        Queue queue= new LinkedList();
        queue.add("string");
        queue.add("Lowkey");
//        Set set= (Set) myList.stream()
//                .collect(Collectors.toSet());
        System.out.println("The redundant Data: "+set);

        System.out.println("Queue: "+queue);

        return uniques;
    }
}
