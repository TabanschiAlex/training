package com.training;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Welcome"));
    }

    /**
     *
     * @param sentence takes in a string of one or more words
     * @return the same string, but with all five or more letter words reversed
     */
    public static String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(el -> el.length() > 4 ? new StringBuilder(el).reverse().toString() : el)
                .collect(Collectors.joining(" "));
    }
}
