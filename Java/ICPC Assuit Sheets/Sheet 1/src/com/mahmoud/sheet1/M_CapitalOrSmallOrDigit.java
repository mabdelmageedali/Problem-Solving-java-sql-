package com.mahmoud.sheet1;

import java.util.Scanner;

public class M_CapitalOrSmallOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char x = sc.nextLine().charAt(0);

        if((int) x >= '0' && (int) x <= '9')
            System.out.println("IS DIGIT\n");
        else if((int) x >= 65 && (int) x <= 90)
            System.out.println("ALPHA\n" +
                    "IS CAPITAL\n");
        else
            System.out.println("ALPHA\n" +
                    "IS SMALL\n");
    }
}
