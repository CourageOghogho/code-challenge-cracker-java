package dev.decagon.simple;

import java.util.Collections;
import java.util.List;

public class MinMaxSum {


        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {

            // Write your code here
            long minSum=0;
            long maxSum=0;
            int j=arr.size()-1;
            Collections.sort(arr);
            //arr.stream().sorted();
            for(int i=0;i<4;i++){
                minSum+=arr.get(i);
                maxSum+=arr.get(j);
                j--;
            }
            System.out.println(""+minSum+" "+maxSum);
        }

    }



/*

    Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

        Example

        The minimum sum is  and the maximum sum is . The function prints

        16 24
        Function Description

        Complete the miniMaxSum function in the editor below.

        miniMaxSum has the following parameter(s):

        arr: an array of  integers
        Print

        Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

        Input Format

        A single line of five space-separated integers.

        Constraints


        Output Format

        Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

        Sample Input

        1 2 3 4 5
        Sample Output

        10 14
*/