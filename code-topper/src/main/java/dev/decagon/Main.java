package dev.decagon;

import dev.decagon.simple.FindDistinct;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] strArr=new String[]{"word","abc","def","abc","word"};
        System.out.println(FindDistinct.findDistinct(strArr));
    }
}