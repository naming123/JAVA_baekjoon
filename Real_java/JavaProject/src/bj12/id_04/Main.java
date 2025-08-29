package bj12.id_04;

import java.io.*;

public class Main {
    static char[][] black; // static 전역 선언
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] A = br.readLine().trim().split("\\s+");

        int N= Integer.parseInt(A[0]);
        int M= Integer.parseInt(A[1]);

        // for문을 돌려서 입력
        black = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                black[i][j] = line.charAt(j);
            }
        }

        // paint
        int min =64;
        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                if(min>paint(i, j)){
                    min=paint(i,j);
                    // System.out.println(4);
                    // System.out.println(paint(i,j));
                    // System.out.println(min);
                }
            }
        }
        // System.out.println(5);
        System.out.println(min);

    }

    // x와 y는 체스판에서 가장 오른쪽 아래에 있는 점
    static int paint(int x, int y){
        int Beven = b1(x, y); // (i+j) 짝수칸의 B 개수
        int Bodd  = b2(x, y); // (i+j) 홀수칸의 B 개수

        int costEvenBlack = (32 - Beven) + Bodd; // 짝수칸=Black
        int costOddBlack  = (32 - Bodd) + Beven; // 홀수칸=Black

        return Math.min(costEvenBlack, costOddBlack);
    }

    // 짝수칸((i+j)%2==0)의 B 개수
    static int b1(int x, int y){
        int cnt = 0;
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if (((i + j) & 1) == 0 && black[x + i][y + j] == 'B') cnt++;
            }
        }
        return cnt;
    }

    // 홀수칸((i+j)%2==1)의 B 개수
    static int b2(int x, int y){
        int cnt = 0;
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if (((i + j) & 1) == 1 && black[x + i][y + j] == 'B') cnt++;
            } // 홀수인지 보는 트릭
        }
        return cnt;
    }

}
        