package KUCC;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N < 8) {
            System.out.println("-1");
            return;
        }

        boolean[] isPrime = sieve(N);

        // 고정 앞자리(2,2/2,3)와 남은 합 결정
        int a, b, rest;
        if (N % 2 == 0) { // 골드바흐의 강한 추측
            a = 2; b = 2; rest = N - 4;
        } else {          // 골드바흐의 약한 추측
            a = 2; b = 3; rest = N - 5;
        }


        // rest = p + q인 소수 p, q 찾기
        for (int p = 2; p <= rest; p++) {
            if (isPrime[p] && rest - p >= 2 && isPrime[rest - p]) {
                int q = rest - p;
                System.out.println(a + " " + b + " " + p + " " + q);
                return;
            }
        }

        
        System.out.println("-1");
    }

    static boolean[] sieve(int n) {

        // 에라토스테네스의 체 만들기
        boolean[] isPrime = new boolean[n + 1];
        if (n >= 2) Arrays.fill(isPrime, true);
        isPrime[0] = false; 
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
