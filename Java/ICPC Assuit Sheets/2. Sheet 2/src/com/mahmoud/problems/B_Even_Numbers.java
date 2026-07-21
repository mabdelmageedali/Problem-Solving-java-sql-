package com.mahmoud.problems;

import java.util.Scanner;

public class B_Even_Numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean prent = false;
        for(int i = 1; i <= num; i++){
            if( i % 2 == 0){
                System.out.println(i);
                prent = true;
            }
        }

        if(!prent)
            System.out.println(-1);
    }
}
