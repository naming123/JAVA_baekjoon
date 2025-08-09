package bj05.id_08;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine().trim();
        
      
        // 공백으로 시작하거나 끝나는경우에는 어떻게 할 것인가? => trim 및 \\+s로 해결가능

        if (A.isEmpty()) {
            System.out.println(0); // 빈 문자열이면 단어 없음
        } else {
            String[] words = A.split("\\s+");
            System.out.println(words.length);
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
