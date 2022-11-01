package dev.decagon.simple;


//PROBLEM :
//
//        Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//        Example
//
//        Input: nums = [1,1,0,1,1,1]
//        Output: 3
//        Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

public class BinaryCount {
    public static int binaryCounter(int[] nums){

        int temp=0;
        int result=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==1){
                temp+=1;
            }else {
                temp=0;
            }
            if(result<temp){
                result=temp;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(binaryCounter(new int[]{1,0,1,1,0,0,1,0,1,0,0,0,0,1,1,1,1,1,1}));
    }
}
