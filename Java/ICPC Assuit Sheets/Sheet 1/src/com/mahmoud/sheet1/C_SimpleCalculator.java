package com.mahmoud.sheet1;

import java.util.Scanner;

public class C_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long input1 = sc.nextLong();
        long input2 = sc.nextLong();


        System.out.println(input1 + " + " + input2 + " = " + (input1 + input2) );
        System.out.println(input1 + " * " + input2 + " = " + (input1 * input2) );
        System.out.println(input1 + " - " + input2 + " = " + (input1 - input2) );
    }
}
