package com.training;

import java.util.*;

public class SortTheOdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));
    }
    public static int[] sortArray(int[] array) {
        List<Integer> pos = new LinkedList<>();
        List<Integer> tmp = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                continue;
            }

            pos.add(i);
            tmp.add(array[i]);
        }

        tmp.sort(Integer::compare);

        for (int i = 0; i < tmp.size(); i++) {
            array[pos.get(i)] = tmp.get(i);
        }

        return array;
    }
}
