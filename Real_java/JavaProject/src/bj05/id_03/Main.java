package bj05.id_03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        int number = Integer.parseInt(br.readLine());
        for (int i = 0; i < number; i++) {
            line =br.readLine();
            char a = line.charAt(0);
            char b = line.charAt(line.length()-1);
            System.out.println(a+""+b);
        }
        

        
        br.close();
        bw.flush();
        bw.close();
    }
    
}
