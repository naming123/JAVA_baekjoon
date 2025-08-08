package bj05.id_06;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            String[] parts = br.readLine().split(" ", 2); // limit을 걸어놓을 수 있다.
            int R = Integer.parseInt(parts[0]);
            String S = parts[1];

            char[] out = new char[S.length() * R]; // char[]과 String[]의 차이?
            int p = 0;
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                for (int k = 0; k < R; k++) out[p++] = ch; // out[p++]의 의미?
            }
            bw.write(out, 0, out.length);
            bw.newLine();
        }
        bw.flush();
    }
}
