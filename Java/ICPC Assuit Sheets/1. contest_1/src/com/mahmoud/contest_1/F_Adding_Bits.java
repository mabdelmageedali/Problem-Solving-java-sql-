package com.mahmoud.contest_1;

import java.util.Scanner;

public class F_Adding_Bits {
    static void main() {
        Scanner sc = new Scanner(System.in);

        long n1 = sc.nextLong();
        long n2 = sc.nextLong();

        System.out.println( n1 ^ n2);

    }
}
