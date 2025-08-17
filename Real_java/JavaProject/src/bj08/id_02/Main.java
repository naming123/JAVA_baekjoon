package bj08.id_02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a =br.readLine().split(" ");

        int N = Integer.parseInt(a[0]);   
        int B = Integer.parseInt(a[1]);   
        
        StringBuilder sb = new StringBuilder();

        // 몫이 0이 될 때까지 반복
        while (N > 0) {
            int R = N % B;  
            if (R >= 10) {
                // 10 이상은 알파벳으로 변환
                sb.append((char) ('A' + (R - 10)));
            } else {
                sb.append(R);
            }
            N /= B; // 몫으로 갱신
        }

        // 뒤집어서 출력
        System.out.println(sb.reverse().toString());

    }
}

        