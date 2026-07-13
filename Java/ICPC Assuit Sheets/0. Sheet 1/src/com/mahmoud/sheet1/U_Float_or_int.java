package com.mahmoud.sheet1;

import java.util.Scanner;

public class U_Float_or_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        int integerPart = (int) num;
        double decimalPart = num - integerPart;

        if (decimalPart == 0) {
            System.out.println("int " + integerPart);
        } else {
            System.out.printf("float %d %.3f", integerPart, decimalPart);
        }
    }
}
