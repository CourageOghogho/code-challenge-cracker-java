package dev.decagon.simple;

import java.util.Arrays;

public class minSum {
        public static int minSum(int[] passed)
        {
            Arrays.sort(passed);
            int j=passed.length-1;
            int sum=0;
            for(int i=0;i<passed.length;i++,j--){
                if(j<i)break;
                sum+=passed[i]*passed[j];
            }

            return sum;
        }
}
