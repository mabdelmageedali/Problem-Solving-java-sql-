package com.mahmoud.sheet1;

import java.util.Scanner;

public class V_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int pos = -1;
        char op = ' ';

        if(str.indexOf('>') != -1) {
            op = '>';
            pos = str.indexOf('>');
        } else if (str.indexOf('<') != -1) {
            op = '<';
            pos = str.indexOf('<');
        } else {
            op = '=';
            pos = str.indexOf('=');
        }

        long n1 = Long.parseLong(str.substring(0, pos).trim());
        long n2 = Long.parseLong(str.substring(pos + 1).trim());

        if(op == '>') {
            System.out.println(n1 > n2 ? "Right" : "Wrong");
        }
        else if(op == '<') {
            System.out.println(n1 < n2 ? "Right" : "Wrong");
        }
        else {
            System.out.println(n1 == n2 ? "Right" : "Wrong");
        }

    }
}
