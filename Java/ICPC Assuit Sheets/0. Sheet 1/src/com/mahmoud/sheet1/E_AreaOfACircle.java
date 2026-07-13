package com.mahmoud.sheet1;

import java.util.Scanner;

public class E_AreaOfACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double area = Math.PI * (r*r);

        System.out.println(area);
    }
}
