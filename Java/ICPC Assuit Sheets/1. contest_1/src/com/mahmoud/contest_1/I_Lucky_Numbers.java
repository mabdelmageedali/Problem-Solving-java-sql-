package com.mahmoud.contest_1;

import java.util.Scanner;

public class I_Lucky_Numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int dig1 = num /10;
        int dig2 = num % 10;

        if (dig1 == 0 || dig2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println(dig1 % dig2 == 0 || dig2 % dig1 == 0 ? "YES" : "NO");
        }
    }
}
