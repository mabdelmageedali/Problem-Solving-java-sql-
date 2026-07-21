package com.mahmoud.problems;

import java.util.Scanner;

public class G_Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for( int i = 0; i < num; i++){
            long n = sc.nextLong();
            long fact = 1;
            for( int x = 1; x <= n; x++){
                fact *= x;
            }
            System.out.println(fact);
        }

    }
}
