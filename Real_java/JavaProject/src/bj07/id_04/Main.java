package bj07.id_04;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        // 2차원 100 x 100배열을 만든다.
        // if input, (input - input+9)(x,y)를 true로 만든다.
        // num번만큼 이를 반복한다.
        // 해당하는 값에 따라 true면 그대로, false면 true로
        
        boolean[][] arr = new boolean[100][100];

        for (int n = 0; n < num; n++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            // 색종이 색칠
            for (int i = x; i < x + 10 && i < 100; i++) {
                for (int j = y; j < y + 10 && j < 100; j++) {
                    arr[i][j] = true;
                }
            }
        }

        int count =0;
        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                if (arr[a][b]) {
                    count+=1;
                }
            }
        }System.out.println(count);
    }
}
