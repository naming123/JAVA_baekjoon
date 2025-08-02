package bj02.id_05;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();

        String[] parts = line.split(" ");
        int H = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);
        int T = H*60+M-45;
        H = T / 60;
        M = T % 60;
        if (M<0) {
            H= 23;
            M=M+60;
        }
        bw.write(H+" "+M);



        bw.flush(); 
        br.close(); 
        bw.close();

    }
}
