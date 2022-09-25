package dev.decagon.simple;

import java.util.Collections;
import java.util.List;

public class BirthDayCakeCandles {


    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Collections.sort(candles);
        int count =1;
        int size=candles.size();
        int largest=candles.get(size-1);
        for (int i = size-2; i >=0;i--) {
            if(candles.get(i)!=largest){
                break;
            }else{
                count++;
            }
        }
        return count;
    }

}

