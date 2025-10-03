package bj16.id_07;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int cnt =N;
        // 단계별의 주제가 스택 큐 덱인데 스택 큐는 아닌거 같아서 덱을 썼다
        Deque<Integer> q = new ArrayDeque<>(N);
        for (int i = 1; i <= N; i++) {
            q.addLast(i);
        }
        while(cnt!=1){
            // step 1
            q.pollFirst(); 
            cnt=cnt-1;

            // step 2
            q.addLast(q.pollFirst());  

        }
        System.out.println(q.peekFirst());
    }
}