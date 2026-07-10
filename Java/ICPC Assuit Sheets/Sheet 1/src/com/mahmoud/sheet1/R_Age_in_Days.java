package com.mahmoud.sheet1;

import java.util.Scanner;

public class R_Age_in_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long years = num / 365;
        long months = (num - (years * 365)) / 30;
        long days = (num - ((years * 365) + (months * 30)) )  % 30;

        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");


    }
}
