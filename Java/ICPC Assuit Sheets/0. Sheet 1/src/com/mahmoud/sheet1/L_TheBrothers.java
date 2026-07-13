package com.mahmoud.sheet1;
import java.util.Scanner;

// instead of reading two stings and cut them after the white space the compare
// we can read four separated strings as in the console if you click space to enter the second space
// it will be considered as new string then compare the second string with the fourth

public class L_TheBrothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String f1 = sc.next();
        String s1 = sc.next();

        String f2 = sc.next();
        String s2 = sc.next();

        if(s1.equals(s2))
            System.out.println("ARE Brothers");
        else
            System.out.println("NOT");
    }
}

/*
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int indexOfSpace1 = str1.indexOf(" ");
        int indexOfSpace2 = str2.indexOf(" ");


        if(str1.substring(indexOfSpace1).equals(str2.substring(indexOfSpace2)))
            System.out.println("ARE Brothers");
        else
            System.out.println("NOT");
*/