package bj13.id_06;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final long OFFSET = 100_000L;   // y를 0 이상으로 양수화
        final long BASE   = 200_001L;   // [-100000,100000]은 200,001개 → 이 폭을 써야 경계 안 꼬임
        int N = Integer.parseInt(br.readLine());
        // x가 10자리, y가 1자리
        Long[] xy = new Long[N];

        // 문자열 각 자리 → int 배열
        for (int i = 0; i < N; i++) {
            String[] aa = br.readLine().split("\\s+");
            long x = Long.parseLong(aa[0]);
            long y = Long.parseLong(aa[1]);
            // Long vs long


             xy[i] = x * BASE + (y + OFFSET);  
        }

        // 오름차순 정렬
        Arrays.sort(xy);

            // long Y = xy[i]%200000;
            // 자바의 %는 수학적인 나머지가 아님
            // System.out.println(1+""+Y);
        for (int i = 0; i < N; i++) {
            long key = xy[i];

            long Y = key % BASE;      // 0..BASE-1
            if (Y < 0) Y += BASE;     // 음수 보정
            long y = Y - OFFSET;      // 원래 y 복원

            long x = Math.floorDiv(key - Y, BASE); // x 복원 (음수 안전)

            bw.write(x + " " + y + "\n");
        }

        bw.flush();
        bw.close();
    }
}
        
        