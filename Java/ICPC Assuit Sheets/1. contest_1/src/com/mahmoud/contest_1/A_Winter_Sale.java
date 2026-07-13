package com.mahmoud.contest_1;

import java.util.Scanner;

public class A_Winter_Sale {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int sailPercentage = sc.nextInt();
        double priceAfter = sc.nextDouble();

        double originalPrice = priceAfter * 100 / (100 - sailPercentage);

        double result = Math.ceil(originalPrice * 100) / 100;

        System.out.printf("%.2f\n", result);


    }
}
