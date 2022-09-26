package dev.decagon.simple;

public class UniqueCharacter {
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("ABCD"));
    }

        public static boolean hasUniqueChars(String str) {
            str.toLowerCase();
            boolean result=true;
            for(int i=0;i<str.length();i++){
                String temp=str.substring(i+1);
                if(temp.contains(""+str.charAt(i))){
                    result=false;
                }
            }

            return result;
        }
    }
//The task is to confirm whether the input s tring has each of its characters unique in the string