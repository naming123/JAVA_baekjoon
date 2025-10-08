package bj16.id_10;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        Deque<int[]> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            dq.addLast(new int[]{i + 1, Integer.parseInt(arr[i])});
        }

        int[] cur = dq.pollFirst();
        bw.write(cur[0] + " ");
        int k = cur[1];

        while (!dq.isEmpty()) {
            if (k > 0) {
                for (int i = 0; i < k - 1; i++) dq.addLast(dq.pollFirst());
            } else {
                for (int i = 0; i < -k; i++) dq.addFirst(dq.pollLast());
            }
            cur = dq.pollFirst();
            bw.write(cur[0] + (dq.isEmpty() ? "" : " "));
            k = cur[1];
        }

        bw.flush();
        bw.close();
    }
}
