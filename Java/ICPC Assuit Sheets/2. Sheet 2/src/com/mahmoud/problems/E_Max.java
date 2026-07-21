package com.mahmoud.problems;

import java.util.Arrays;
import java.util.Scanner;

public class E_Max {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int [] arr = new int[num];

        int max = arr[0];
        for( int i = 0; i < num; i++){
            arr[i] = sc.nextInt();

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
