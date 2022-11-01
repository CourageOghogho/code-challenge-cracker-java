package dev.decagon.simple;

public class EvenCount {
    public static int evenDigitCount(int[] num){
        int evenCounter=0;
        for (int item: num){
            if(String.valueOf(item).length()%2==0){
                evenCounter+=1;
            }
        }
        return evenCounter;
    }

    public static void main(String[] args) {
        System.out.println(evenDigitCount(new int[]{1,221,3324,33,4444,555554}));
    }
}
