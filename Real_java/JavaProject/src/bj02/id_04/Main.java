package bj02.id_04;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        // String[] parts = line.split(" ");
        int A = Integer.parseInt(line);

        if (A%4==0) {
            if (A%100 != 0) {
                bw.write("1");

            }
            else {
                if (A%400==0) {
                    bw.write("1");
                } else{bw.write("0");}
                
            } 
            
        }else{bw.write("0");}

        br.close();
        bw.flush(); 
        br.close(); 
        bw.close();

    }
}
