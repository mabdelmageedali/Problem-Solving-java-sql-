package com.mahmoud.sheet1;

import java.util.Scanner;

public class G_SummationFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        long sum = num * (num + 1) /2;

        System.out.println(sum);
    }
}
