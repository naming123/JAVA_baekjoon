// 발표

import java.io.*;
import java.util.*;

public class Main {


    static int N, M;
    static char[][] grid;
    static int[][] distS, distT;
    static final int[] dr = {-1, 1, 0, 0};
    static final int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);

        grid = new char[N][M];
        for (int i = 0; i < N; i++) grid[i] = br.readLine().toCharArray();

        distS = new int[N][M];
        distT = new int[N][M];

        Zeros(0, 0, distS);
        Zeros(N - 1, M - 1, distT);

        int ans = 1000000000;
        if (distS[N - 1][M - 1] > 0) ans = distS[N - 1][M - 1];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (grid[r][c] != '1') continue;
                // 벽1개만 뚫을것 => 시작과 끝에서 거기(1의 위치)까지 가는 곳이 최단거리
                int[] aR = new int[4], aC = new int[4]; int aCnt = 0; // 시작
                int[] bR = new int[4], bC = new int[4]; int bCnt = 0; // 끝

                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d], nc = c + dc[d];
                    if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                    if (grid[nr][nc] != '0') continue;
                    if (distS[nr][nc] > 0) { aR[aCnt] = nr; aC[aCnt] = nc; aCnt++; }
                    if (distT[nr][nc] > 0) { bR[bCnt] = nr; bC[bCnt] = nc; bCnt++; }
                }
                if (aCnt == 0 || bCnt == 0) continue;

                for (int i = 0; i < aCnt; i++) {
                    for (int j = 0; j < bCnt; j++) {
                        int cand = distS[aR[i]][aC[i]] + 1 + distT[bR[j]][bC[j]];
                        if (cand < ans) ans = cand;
                    }
                }
            }
        }

        System.out.println(ans == 1000000000 ? -1 : ans);
    }

    // 0만 통과하는 BFS (시작칸 포함하여 1부터 카운트)
    static void Zeros(int sr, int sc, int[][] dist) {
        for (int[] row : dist) Arrays.fill(row, 0);
        if (sr < 0 || sr >= N || sc < 0 || sc >= M) return;
        if (grid[sr][sc] != '0') return;

        ArrayDeque<int[]> q = new ArrayDeque<>();
        dist[sr][sc] = 1;
        q.add(new int[]{sr, sc});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d], nc = c + dc[d];
                if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue; // 격자밖으로 나가지 않게 함
                if (grid[nr][nc] != '0') continue; // 현재는 0만 통과하게 하려고 함
                if (dist[nr][nc] != 0) continue; // 이미 갔던데를 또 가게 하면 최단거리가 아님
                dist[nr][nc] = dist[r][c] + 1;
                q.add(new int[]{nr, nc});
            }
        }
    }
}

        