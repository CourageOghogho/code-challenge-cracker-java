package dev.decagon.simple;

public class EvenCount {
    public static int evenDigitCount(int[] num){
        int evenCount=0;
        for (int item: num){
            if(String.valueOf(item).length()%2==0){
                evenCount+=1;
            }
        }
        return evenCount;
    }

    public static void main(String[] args) {
        System.out.println(evenDigitCount(new int[]{1,221,3324,33,4444,555554}));
    }
}
