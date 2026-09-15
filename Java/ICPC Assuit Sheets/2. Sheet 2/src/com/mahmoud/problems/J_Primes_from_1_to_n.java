package com.mahmoud.problems;

import java.util.Scanner;

public class J_Primes_from_1_to_n {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.print(i + " ");
        }
    }
}