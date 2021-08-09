package com.training;

import java.util.LinkedList;
import java.util.List;

public class Multiples3Or5 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int number) {
        List<Integer> multiplesNum = new LinkedList<Integer>();

        for (int i = 1; i < number; i++) {
            int m3 = 3 * i;
            int m5 = 5 * i;

            if (m3 >= number && m5 >= number) {
                break;
            }

            if ((m3 % 5) == 0) {
                multiplesNum.add(m3);
                break;
            }

            if ((m5 % 3) == 0 && m5 < number) {
                multiplesNum.add(m5);
                break;
            }

            if (m3 < number && m3 > 0) {
                multiplesNum.add(m3);
            }

            if (m5 < number && m5 > 0) {
                multiplesNum.add(m5);
            }
        }

        return multiplesNum.stream().reduce(Integer::sum).orElse(0);
    }
}
