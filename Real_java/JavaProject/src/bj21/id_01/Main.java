package bj21.id_01;
import java.io.*;

public class Main {
    static int a = 0;  // 재귀 호출 횟수
    static int b = 0;  // DP 실행 횟수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        fib(n);
        fibonacci(n);

        bw.write(a + " " + b + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    // 재귀 방식
    static int fib(int n) {
        if (n == 1 || n == 2) {
            a++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // 동적 프로그래밍 방식
    static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            b++;
        }
        return f[n];
    }
}