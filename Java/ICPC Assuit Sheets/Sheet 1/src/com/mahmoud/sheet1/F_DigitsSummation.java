package com.mahmoud.sheet1;

import java.util.Scanner;

public class F_DigitsSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n1 = sc.nextLong() % 10;
        long n2 = sc.nextLong() % 10;

        System.out.println(n1 + n2);
    }
}
