package com.mahmoud.contest_1;

import java.util.Scanner;

public class G_Katryoshka {
    static void main() {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();

        long res = 0;

        // 1) 1 eye + 1 mouth + 1 body
        long t = Math.min(Math.min(n, m), k);
        res += t;
        n -= t;
        m -= t;
        k -= t;

        // 2) 2 eyes + 1 body
        t = Math.min(n / 2, k);
        res += t;

        System.out.println(res);
    }
}
