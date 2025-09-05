package bj13.id_08;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        final long BASE   = 200_001L;
        int N = Integer.parseInt(br.readLine());
        // x가 10자리, y가 1자리
        Long[] xy = new Long[N];

        // 문자열 각 자리 → int 배열
        for (int i = 0; i < N; i++) {
            String[] aa = br.readLine().split("\\s+");
            long x = Long.parseLong(aa[0]);
            long y = Long.parseLong(aa[1]);
            // Long vs long
             xy[i] = y * BASE + (x + BASE/2);  
        }

        // 오름차순 정렬
        Arrays.sort(xy);

        for (int i = 0; i < N; i++) {
            long X = xy[i] % BASE;      // 0..BASE-1
            if (X < 0) X += BASE;     // 음수 보정
            long x = X - BASE/2;      // 원래 x 복원

            long y = Math.floorDiv(xy[i] - X, BASE); // y 복원 (음수 안전)

            bw.write(x + " " + y + "\n");
        }

        bw.flush();
        bw.close();
    }
}
        
        