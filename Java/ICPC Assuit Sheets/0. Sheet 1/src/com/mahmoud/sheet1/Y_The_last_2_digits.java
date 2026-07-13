package com.mahmoud.sheet1;

import java.util.Scanner;

public class Y_The_last_2_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long l1 = sc.nextLong();
        long r1 = sc.nextLong();
        long l2 = sc.nextLong();
        long r2 = sc.nextLong();

        long result = 1;

        result = (result * (l1 % 100)) % 100;
        result = (result * (r1 % 100)) % 100;
        result = (result * (l2 % 100)) % 100;
        result = (result * (r2 % 100)) % 100;

        System.out.printf("%02d\n", result);

    }
}
