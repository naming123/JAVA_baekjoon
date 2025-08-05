package bj03.id_06;

import java.io.*;
// import java.util;.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String N = br.readLine();  // vs StringTokenizer
        int N1 = Integer.parseInt(N);

        for (int i = 0; i<N1;i++){
            String A = br.readLine();
            String[] parts = A.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);

            
            bw.write(a+b+"\n");
            // bw.flush(); // 이렇게 쓰면 buffer를 쓰는 의미가 없다.
        }
        bw.flush();
        br.close();
        bw.close();
    }
    
}
