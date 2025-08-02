package bj02.id_07;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        String[] parts = line.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int prize;
        
        if (a == b && b == c) {
            prize = 10000 + a * 1000;
        } else 
            if (a == b || a == c) {

                prize = 1000 + a * 100;
            } else 
                if (b == c) {
                    prize = 1000 + b * 100;
                } else {
                    int max = Math.max(a, Math.max(b, c));
                    prize = max * 100;
                }

        bw.write(prize+"");

        bw.flush(); 
        br.close(); 
        bw.close();

    }
}
