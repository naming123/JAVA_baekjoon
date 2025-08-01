package id_06;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        String[] parts = line.split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        String line1 = br.readLine();
        int C = Integer.parseInt(line1);
        int T = A*60 + B;
        C = T+C;
        A=C/60;
        B=C%60;
        
        if (A>24) {
            A= A/24;
            B=B+60;
        }
        bw.write(A+" "+B);



        bw.flush(); 
        br.close(); 
        bw.close();

    }
}
