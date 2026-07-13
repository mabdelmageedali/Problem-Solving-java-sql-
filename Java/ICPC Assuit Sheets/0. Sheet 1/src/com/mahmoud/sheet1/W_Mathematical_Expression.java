package com.mahmoud.sheet1;

import java.util.Scanner;

public class W_Mathematical_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int pos = -1;
        char op = ' ';
        int eq = str.indexOf('=');
        String expression = str.substring(0, eq);

        if (expression.indexOf('+') != -1) {
            op = '+';
            pos = expression.indexOf('+');
        } else if (expression.indexOf('-') != -1) {
            op = '-';
            pos = expression.indexOf('-');
        } else {
            op = '*';
            pos = expression.indexOf('*');
        }

        long num1 = Long.parseLong(str.substring(0, pos).trim());
        long num2 = Long.parseLong(str.substring(pos + 1 ,  eq).trim());
        long num3 = Long.parseLong(str.substring(eq + 1).trim());


        if(op == '+')
            System.out.println( (num1 + num2 == num3) ? "Yes\n" : (num1+num2) );
        else if( op == '-')
            System.out.println( (num1 - num2 == num3) ? "Yes\n" : (num1-num2) );
        else
            System.out.println( (num1 * num2 == num3) ? "Yes\n" : (num1*num2) );

    }
}
