package com.mahmoud.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class C_Even_Odd_Positive_and_Negative {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int pos = 0;
        int neg = 0;

        int num = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;

            if(arr[i] > 0 )
                pos++;
            else if( arr[i] < 0)
                neg++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);

    }
}
