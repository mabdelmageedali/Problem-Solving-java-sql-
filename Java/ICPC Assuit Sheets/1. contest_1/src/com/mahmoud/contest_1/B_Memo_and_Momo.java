package com.mahmoud.contest_1;

import java.util.Scanner;

public class B_Memo_and_Momo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        long me = sc.nextLong();
        long mo = sc.nextLong();
        long num = sc.nextLong();

        if(me % num == 0 && mo % num == 0){
            System.out.println("Both");
        }else if(me % num == 0 && mo % num != 0){
            System.out.println("Memo");
        }else if(me % num != 0 && mo % num == 0){
            System.out.println("Momo");
        }else{
            System.out.println("No One");
        }
    }
}
