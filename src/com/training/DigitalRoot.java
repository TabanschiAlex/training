package com.training;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(123));
    }

    /**
     *
     * @param n take the sum of the digits of n. If that value has more than one digit
     *          continue reducing in this way until a single-digit number is produced.
     *          The input will be a non-negative integer
     * @return single-digit number
     */
    public static int digitalRoot(int n) {
        if (n < 10) {
            return n;
        }

        return digitalRoot(sumInt(n));
    }

    public static int sumInt(int n) {
        if (n / 10 == 0) {
            return n;
        }

        return n % 10 + sumInt(n / 10);
    }
}
