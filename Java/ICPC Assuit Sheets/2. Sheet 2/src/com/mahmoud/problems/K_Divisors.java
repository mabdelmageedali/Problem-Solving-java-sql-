package com.mahmoud.problems;

import java.util.Scanner;

public class K_Divisors {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int max = Math.max(n1, n2);
        int gdc = 1;

        for(int i = 1; i < max; i++){
            if(n1 % i == 0 && n2 % i == 0){
                gdc = i;
            }
        }

        System.out.println(gdc);
    }
}
