package com.mahmoud.sheet1;

import java.util.Scanner;

public class K_MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        long n3 = sc.nextLong();

        long min = Math.min(n1 , Math.min(n2,n3));
        long max = Math.max(n1, Math.max(n2,n3));

        System.out.println(min + " " + max );

    }
}
