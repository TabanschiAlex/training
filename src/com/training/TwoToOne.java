package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    public static String longest(String s1, String s2) {
        Set<Character> characterSet = new HashSet<Character>();
        String str = s1 + s2;
        char[] chars = str.toCharArray();


        for (char aChar : chars) {
            characterSet.add(aChar);
        }

        return characterSet.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
