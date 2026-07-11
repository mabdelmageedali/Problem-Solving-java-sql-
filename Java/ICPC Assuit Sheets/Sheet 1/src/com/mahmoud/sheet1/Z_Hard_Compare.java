package com.mahmoud.sheet1;

import java.util.Scanner;

public class Z_Hard_Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double res1 = n2 * Math.log(n1);
        double res2 = n4 * Math.log(n3);

        System.out.println( res1 > res2 ? "YES\n" :"NO\n");

    }
}
