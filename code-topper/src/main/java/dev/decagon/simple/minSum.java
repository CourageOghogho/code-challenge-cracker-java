package dev.decagon.simple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class minSum {
        public static boolean minSum()
        {
//           int[] passed=new int[3];
//            Arrays.sort(passed);
//            int j=passed.length-1;
//            int sum=0;
//            for(int i=0;i<passed.length;i++,j--){
//                if(j<i)break;
//                sum+=passed[i]*passed[j];
//            }
            Stream.of(2,3,4,5);
            Object o=new Object();
            boolean b = o.getClass() == String.class;
            System.out.println(b);
            return b;

        }

    public static void main(String[] args) {
        minSum();
        Integer i=2;
        System.out.println(i.getClass());
    }



    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(item->item.getClass()==Integer.class)
                .collect(Collectors.toList());
    }


}
