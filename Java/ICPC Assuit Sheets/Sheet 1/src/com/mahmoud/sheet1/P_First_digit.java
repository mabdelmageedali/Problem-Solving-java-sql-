package com.mahmoud.sheet1;

import java.util.Scanner;

public class P_First_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char first = str.charAt(0);

        int num = first - '0';

        if(num % 2 == 0) System.out.println("EVEN\n");
        else System.out.println("ODD\n");
    }
}


//'0' = 48
//'1' = 49
//'2' = 50
// int num = first - '0';
 // if first = '2' then the value will be 50
// so 50 - '0' --> 50 - 48 = 2


