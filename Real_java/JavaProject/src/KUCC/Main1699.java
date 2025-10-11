package KUCC;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1699 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        // 점화식으로 풀어보자
        int[] dp = new int[N + 1];
        Arrays.fill(dp, N);

        // 제곱수 배열 (합이 N이 될)
        List<Integer> sq = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) sq.add(i * i);

        dp[0] = 0;
        for (int j = 1; j <= N; j++) {
            // 모든 수가 제곱수의 합으로 나타낼 수 있다는 것은 1^2이 있기 때문이고 
            // 우리는 그거보다 더 적은 횟수를 찾고 싶은 것이다.
            int best = j; 
            for (int s : sq) {
                if (s > j) break;
                if (dp[j - s] + 1 < best) best = dp[j - s] + 1;
                // s빼고 더한 값 (+ s를 사용한 횟수)
            }
            dp[j] = best; // 더 적은 수 업데이트
        }

        System.out.println(dp[N]);
    }
}
