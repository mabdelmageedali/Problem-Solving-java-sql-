package com.mahmoud.problems;

import java.util.Scanner;

public class A_1_to_N {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i < num; i++){
            System.out.println(i);
        }
    }
}
