package com.mahmoud.sheet1;

import java.util.Scanner;

public class H_TwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();

        int floor = Math.floorDiv(num , num2);
        int ceil = Math.ceilDiv(num, num2);

        float div = ( (float) num) / num2;

        int round = Math.round(div);
        System.out.println("floor " + num + " / " + num2 + " = " + floor);
        System.out.println("ceil " + num + " / " + num2 + " = " + ceil);
        System.out.println("round " + num + " / " + num2 + " = " + round);

    }
}
