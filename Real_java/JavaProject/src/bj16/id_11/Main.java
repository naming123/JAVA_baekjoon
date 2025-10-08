package bj16.id_11;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        int M = Integer.parseInt(br.readLine());
        String[] C = br.readLine().split(" ");

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            if (A[i].charAt(0) == '0') { // 큐
                dq.addFirst(Integer.parseInt(B[i]));
            }
        }

        // 큐가 하나도 없으면(=dq 비어있음) 입력 그대로 출력.
        for (int i = 0; i < M; i++) {
            int c = Integer.parseInt(C[i]);
            if (dq.isEmpty()) {
                bw.write(String.valueOf(c));
            } else {
                int out = dq.pollFirst();
                bw.write(String.valueOf(out));
                dq.addLast(c);
            }
            if (i + 1 < M) bw.write(" ");
        }
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}
