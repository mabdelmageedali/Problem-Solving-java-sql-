package com.mahmoud.problems;

import java.util.Scanner;

public class F_Multiplication_table {
    static void main() {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        for( int i = 1; i < 13; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
