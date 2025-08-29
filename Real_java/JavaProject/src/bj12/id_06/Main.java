package bj12.id_06;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int aa = Integer.parseInt(br.readLine());
        System.out.println(solve(aa));
    }

    static int solve(int aa) {
        for (int cnt = 0; cnt * 3 <= aa; cnt++) {         // 3kg 개수 시도
            int bb = aa - cnt * 3;                        // 남은 무게
            if (bb % 5 == 0) return cnt + bb / 5;         // 합계(3kg+5kg)
        }
        return -1;
    }
}
        