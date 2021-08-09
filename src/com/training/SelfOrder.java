package com.training;

public class SelfOrder {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }

    public static String order(String words) {
        if (words.isEmpty())
            return "";

        String[] splitWords = words.split(" ");
        String[] result = new String[splitWords.length];

        for (String splitWord : splitWords) {
            for (int j = 1; j <= splitWords.length; j++) {
                if (splitWord.contains(String.valueOf(j))) {
                    result[j - 1] = splitWord;
                }
            }
        }

        return String.join(" ", result);
    }
}
