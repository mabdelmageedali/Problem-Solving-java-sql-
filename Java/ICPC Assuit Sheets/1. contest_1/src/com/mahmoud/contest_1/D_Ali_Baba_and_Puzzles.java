package com.mahmoud.contest_1;

import java.util.Scanner;

public class D_Ali_Baba_and_Puzzles {
    static void main() {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        if (a + b - c == d ||
                a + b * c == d ||
                a - b + c == d ||
                a - b * c == d ||
                a * b + c == d ||
                a * b - c == d) {

            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
