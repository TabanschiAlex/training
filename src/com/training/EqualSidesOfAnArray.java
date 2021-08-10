package com.training;

import java.util.Arrays;

public class EqualSidesOfAnArray {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 3, 4, 3, 2, 1 };
        System.out.println(findEvenIndex(numbers));
    }

    public static int findEvenIndex(int[] arr) {
        int posDivider = 0;
        int leftSide;
        int rightSide;

        do {
            leftSide = 0;
            rightSide = 0;

            for (int i = 0; i < posDivider; i++) {
                leftSide += arr[i];
            }

            for (int i = posDivider + 1; i < arr.length; i++) {
                rightSide += arr[i];
            }

            if (posDivider < arr.length) {
                posDivider++;
                continue;
            }

            return -1;
        } while (leftSide != rightSide);

        return posDivider - 1;
    }
}
