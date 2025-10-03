package bj16.id_08;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int st = Integer.parseInt(input[1]);

        // st번째 수를 보고 st만큼 다음 수를 고르고 
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }
        // 만약 st로 더했는데 N을 넘으면 N을 빼고 다시 시작
        List<Integer> result = new ArrayList<>();
        while (!dq.isEmpty()) {
            // st-1번 만큼 앞으로 돌림
            for (int i = 0; i < st - 1; i++) {
                dq.addLast(dq.pollFirst());
            }
            // st번째 원소 제거
            result.add(dq.pollFirst());
        }

        String aa = result.toString().replace('[', '<').replace(']', '>');
        System.out.println(aa); 
    }
}
