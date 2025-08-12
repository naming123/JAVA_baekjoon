package bj06.id_07;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean[] visited = new boolean[26];
            char prev = 0;
            boolean broken = false; 

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if (c != prev) { 
                    int idx = c - 'a';
                    if (!visited[idx]) {
                        visited[idx] = true;  
                        prev = c;               
                    } else {
                        broken = true; // 이미 나온 문자가 다시 나옴
                        break; // 더 볼 필요 없음
                    }               
                }
            }

            if (!broken) {
                count++;
            }
        }

        System.out.println(count);
    }
}

