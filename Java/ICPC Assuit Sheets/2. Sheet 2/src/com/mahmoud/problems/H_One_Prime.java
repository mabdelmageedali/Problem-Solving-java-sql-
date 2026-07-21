package com.mahmoud.problems;

import java.util.Scanner;

public class H_One_Prime {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num < 2){
            System.out.println("NO\n");
            return;
        }

        boolean prime = true;

        for( int i = 2; i < num; i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }

        if(prime)
            System.out.println("YES\n");
        else
            System.out.println("NO\n");
    }
}
