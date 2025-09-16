package bj07.id_03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] input = new String[5][15];

        // 입력: 각 줄을 문자 단위로 최대 15칸까지 채움 
        for (int r = 0; r < 5; r++) {
            String line = br.readLine();
            if (line == null) line = "";
            int limit = Math.min(15, line.length());  // 문자열 중에 NULL을 넣을 수는 없음, 넣기전에 끝내야됨
            // => 문자열 인덱스가 15보다 작은경우 문자를 넣으려고 하면 오류가 발생
            for (int c = 0; c < limit; c++) {
                input[r][c] = String.valueOf(line.charAt(c));

            }
        }

        // 출력: 열 기준(0..14), 행 거꾸로(4..0), null은 pass, 줄바꿈 없이
        for (int c = 0; c < 15; c++) {
            for (int r = 0; r < 5; r++) {
                if (input[r][c] != null) {
                    System.out.print(input[r][c]);
                }
            }
        }
    }
}