package com.training;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("...tora o mores ![]"));
    }

    /**
     *
     * @param str Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
     * @return str
     */
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(el -> el.matches("[a-zA-Z]+\\.?") ? el.substring(1) + el.split("")[0] + "ay" : el)
                .collect(Collectors.joining(" "));
    }
}
