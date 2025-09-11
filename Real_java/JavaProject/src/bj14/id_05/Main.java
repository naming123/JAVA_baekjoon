package bj14.id_05;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] NN = br.readLine().split(" ");

        // 맵 선언 (key:0)
        Map<String, Integer> map = new HashMap<>();
        // for N) string으로 맵 append 및 cnt++
        // if contains => false면 append/cnt=1, true면 cnt++
        for (int i = 0; i < N; i++) {
            String key = NN[i];
            if (map.containsKey(key)) { // getOrDefault로 대체가능
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        // 
        int M = Integer.parseInt(br.readLine());
        String[] MM = br.readLine().split(" ");
        // for M) string으로 맵 append 및 cnt++
        // if contains => false면 retur n 0; true면 return cnt;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String key1 = MM[i];
            if (map.containsKey(key1)) {
                sb.append(map.get(key1));
            } else {
                sb.append(0);
            }
            if (i < M - 1) sb.append(" ");
        }
        
        // sb builder로 모두 append 시킨후 출력
        System.out.println(sb.toString()); // " "가 만들어짐



    }
}











