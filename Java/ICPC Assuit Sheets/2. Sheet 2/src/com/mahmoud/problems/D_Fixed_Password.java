package com.mahmoud.problems;

import java.util.Scanner;

public class D_Fixed_Password {
    static void main() {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while(true){
            long num = sc.nextLong();

            if(num == 1999) {
                flag = false;
                System.out.println("Correct");
                break;
            }else{
                System.out.println("Wrong");
            }

        }
    }
}
