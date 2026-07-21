package com.mahmoud.problems;

import java.util.Scanner;

public class I_Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        System.out.println(reversed);

        if (original == reversed) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}