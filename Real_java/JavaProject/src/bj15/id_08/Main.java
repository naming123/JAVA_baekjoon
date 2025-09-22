package bj15.id_08;

import java.io.*;
import java.util.*;

public class Main {

    
    // 클래스변수 선언
    static HashSet<Integer> PRIMES = new HashSet<>(); // 가져오는 용
    static ArrayList<Integer> PRIME_LIST = new ArrayList<>(); // search용

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 

        // 1) 소수 집합/리스트 만들기 
        sieve(1000000);

        for (int i=0;i<N;i++){
            int m = Integer.parseInt(br.readLine()); 
            // 2) 골드바흐 쌍 개수 세기
            int count = goldbachCount(m);
            System.out.println(count);
        }

        
    }

    // 에라토스테네스의 체
    static void sieve(int limit) {
        boolean[] isComposite = new boolean[limit + 1];
        isComposite[0] = true; 
        if (limit >= 1) isComposite[1] = true;

        for (int i = 2; i * i <= limit; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        for (int i = 2; i <= limit; i++) {
            if (!isComposite[i]) {
                PRIMES.add(i);
                PRIME_LIST.add(i);
            }
        }
    }

    
    static int goldbachCount(int a) {
        if (a < 4 || (a & 1) == 1) return 0; 
        int cnt = 0;
        // p ≤ a/2 범위의 소수만 순회 
        for (int p : PRIME_LIST) {
            if (p > a / 2) break;
            if (PRIMES.contains(a - p)) cnt++;
        }
        return cnt;
    }
}
