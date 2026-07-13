package com.mahmoud.contest_1;

import java.util.Scanner;

public class E_Interval_Sweep {
    static void main() {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if( a != 0 || b != 0){
            if (a - b == 0 || a - b == 1){
                System.out.println("YES\n");
            } else if (b - a == 0 || b - a == 1){
                System.out.println("YES\n");
            }else{
                System.out.println("NO\n");
            }
        }else{
            System.out.println("NO\n");
        }


    }
}
