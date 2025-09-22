package bj15.id_05;

import java.io.*;

public class Main {
    
    static int LIMIT = 123456 * 2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1) 에라토스테네스의 체
        boolean[] isComposite = new boolean[LIMIT + 1];
        isComposite[0] = true; 
        isComposite[1] = true;
        for (int i = 2; i * i <= LIMIT; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        // 2) 누적 소수 개수
        int[] primePrefix = new int[LIMIT + 1];
        for (int i = 1; i <= LIMIT; i++) {
            primePrefix[i] = primePrefix[i - 1] + (isComposite[i] ? 0 : 1);
        }

        // 3) 입력 처리: 각 n에 대해 (n, 2n] = primePrefix[2n] - primePrefix[n]
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break; // 0을 넣으면 끝남

            int ans = primePrefix[2 * n] - primePrefix[n];
            sb.append(ans).append('\n');
        }

        System.out.print(sb.toString());
    }
}
