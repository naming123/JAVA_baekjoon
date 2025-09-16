package bj02.id_02; //https://dkswnkk.tistory.com/539

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        String[] parts = line.split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);  
        if (A > B) {
            bw.write(">"+"\n");
        }
        if (A < B) {
            bw.write("<"+"\n");
        }
        if (A == B) {
            bw.write("=="+"\n");
        }

        bw.flush(); 
        br.close(); 
        bw.close();

    }
}
