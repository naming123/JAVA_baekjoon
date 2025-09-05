package bj13.id_06;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String N = br.readLine();

        int num = N.length();
        int[] arr = new int[num];

        // 문자열 각 자리 → int 배열
        for (int i = 0; i < num; i++) {
            arr[i] = N.charAt(i) - '0'; // char → int
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        // 내림차순으로 StringBuilder에 붙이기
        StringBuilder sb = new StringBuilder();
        for (int i = num - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}