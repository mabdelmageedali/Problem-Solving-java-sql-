package com.mahmoud.sheet1;

import java.util.Scanner;

public class Q_Coordinates_of_a_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        if (n1 == 0 && n2 == 0 ) System.out.println("Origem\n");
        else if ( n2 == 0) System.out.println("Eixo X\n");
        else if ( n1 == 0) System.out.println("Eixo Y\n");
        else if(n1 > 0 && n2 > 0) System.out.println("Q1\n");
        else if (n1 < 0 && n2 > 0) System.out.println("Q2\n");
        else if (n1 < 0 && n2 < 0) System.out.println("Q3\n");
        else System.out.println("Q4\n");
    }
}
