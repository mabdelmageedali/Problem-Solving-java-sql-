package com.mahmoud.sheet1;

import java.util.Scanner;

public class N_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char ch = sc.next().charAt(0);
        
        if((int) ch >= 65 && (int) ch <= 90){
            ch += 32;
        } else if ((int) ch >= 97 && (int) ch <= 122) {
            ch -= 32;
        }

        System.out.println(ch);
    }
}
