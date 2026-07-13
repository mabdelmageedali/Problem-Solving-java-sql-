package com.mahmoud.sheet1;

import java.util.Arrays;
import java.util.Scanner;

public class T_Sort_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] arr = {n1, n2, n3};

        Arrays.sort(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}


