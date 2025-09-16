package bj05.id_05;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        
        int num =Integer.parseInt(br.readLine());
        String line = br.readLine();
        int a=0;
        for (int i=0; i<num; i++){
            a = line.charAt(i) - '0'+a;
        }
        System.out.println(a);
    }
    
}
