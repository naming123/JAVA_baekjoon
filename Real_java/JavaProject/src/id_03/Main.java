package id_03; //https://dkswnkk.tistory.com/539

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        String[] parts = line.split(" ");
        int A = Integer.parseInt(parts[0]);

        if (100 >=A&&A >= 90) {
            bw.write("A");
        }
        if (90 >A&&A >= 80) {
            bw.write("B");
        }
        if (80 >A&&A >= 70) {
            bw.write("C");
        }
        if (70 >A&&A >= 60) {
            bw.write("D");
        }
        if (60 >A&&A >= 0) {
            bw.write("F");
        }

        bw.flush(); 
        br.close(); 
        bw.close();

    }
}
