package com.mahmoud.sheet1;

import java.util.Scanner;

public class O_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        int pos = -1;
        char op = ' ';

        pos = s.indexOf('+');
        if (pos != -1) op = '+';

        if (pos == -1) {
            pos = s.indexOf('*');
            if (pos != -1) op = '*';
        }

        if (pos == -1) {
            pos = s.indexOf('/');
            if (pos != -1) op = '/';
        }

        if (pos == -1) {
            pos = s.indexOf('-');
            op = '-';
        }

        long a = Long.parseLong(s.substring(0, pos));
        long b = Long.parseLong(s.substring(pos + 1));

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }
    }
}
