package com.training;

import java.util.Arrays;

public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        String str = String.join("", Arrays.toString(numbers).split("[\\[\\]]")[1].split(", "));
        return "(" + str.substring(0, 3) + ")" + " " + str.substring(3, 6) + "-" + str.substring(6);
    }
}
