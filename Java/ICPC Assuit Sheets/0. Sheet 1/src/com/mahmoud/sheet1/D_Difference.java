package com.mahmoud.sheet1;

import java.util.Scanner;

public class D_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long input1 = sc.nextLong();
        long input2 = sc.nextLong();
        long input3 = sc.nextLong();
        long input4 = sc.nextLong();

        System.out.println("Difference = " + ((input1*input2) - (input3*input4)));
    }
}


