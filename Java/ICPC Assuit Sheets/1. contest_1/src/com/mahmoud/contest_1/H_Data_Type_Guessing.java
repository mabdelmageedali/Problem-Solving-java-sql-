package com.mahmoud.contest_1;

import java.util.Scanner;

public class H_Data_Type_Guessing {
    static void main() {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = sc.nextLong();

        long product = n * k;

        if (product % a != 0) {
            System.out.println("double");
        } else {
            long result = product / a;
            if (result >= -2147483648L && result <= 2147483647L) {
                System.out.println("int");
            } else {
                System.out.println("long long");
            }
        }

    }
}
