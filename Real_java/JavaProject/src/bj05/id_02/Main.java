package bj05.id_02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();


        System.out.println(line.length());


        br.close();
        bw.flush();
        bw.close();
    }
    
}
