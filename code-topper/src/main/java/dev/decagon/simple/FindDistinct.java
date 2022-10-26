package dev.decagon.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDistinct {
    public static Set findDistinct(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args)
            s.add(a);
        return  s;
    }

}
