package com.mahmoud.sheet1;

import java.util.Scanner;

public class S_Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        if( num >= 0.0 && num <= 25.0 )
            System.out.println("Interval [0,25]");
        else if (num >= 25.0 && num <= 50.0)
            System.out.println("Interval (25,50]");
        else if (num >= 50.0 && num <= 75.0)
            System.out.println("Interval (50,75]");
        else if (num >= 75.0 && num <= 100.0)
            System.out.println("Interval (75,100]");
        else
            System.out.println("Out of Intervals");
    }
}
