package com.mahmoud.contest_1;

import java.util.Scanner;

public class C_Next_Alphabet {
    static void main() {
        Scanner sc = new Scanner(System.in);

        char alp = sc.next().charAt(0);

        if (alp == 'z') {
            System.out.println('a');
        } else{
            alp += 1;
            System.out.println(alp);
        }

    }
}

