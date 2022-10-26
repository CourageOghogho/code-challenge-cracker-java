package dev.decagon.simple;
import  java.util.Arrays;
public class NthPosition {

        public static int nthSmallest(final int[] arr, final int n) {
            Arrays.sort(arr);
            return arr[n-1]; // Do your magic!
        }
}
