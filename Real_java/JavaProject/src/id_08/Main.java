package id_08;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String N = br.readLine(); 
        int N1 = Integer.parseInt(N);

        for (int i = 1; i<=N1;i++){
            String A = br.readLine();
            String[] parts = A.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int total = a+b;
            
            bw.write("Case #" + i + ": "+a+" + "+b+" = "+total+"\n");
            
        }
        bw.flush();
        br.close();
        bw.close();
    }
    
}
