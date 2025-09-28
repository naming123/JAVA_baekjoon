package bj16.id_05;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());   
        String[] line = br.readLine().split(" "); 

        int[] arr = new int[N];  // 숫자로 바꾸기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        Deque<Integer> stack = new ArrayDeque<>();


        int cnt = 1;  // 다음에 나가야 할 번호

        for (int i = 0; i < N; i++) {
            int cur = arr[i];
            if (cur == cnt) {
                cnt++;
            } else {
                stack.push(cur);
            }

            while (!stack.isEmpty() && stack.peek() == cnt) { // 줄에 있는 사람이 다 나갔거나 스택에 해당 사람이 있는 경우
                stack.pop();
                cnt++;
            }
        }

        if (cnt==N-1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
