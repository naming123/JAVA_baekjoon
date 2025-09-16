package bj03.id_09;

import java.io.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String N = br.readLine();  
        int N1 = Integer.parseInt(N);

        for (int i = 1; i<=N1;i++){
            bw.write("*".repeat(i)+"\n"); // 굳이 객체설정을 따로 안하고도 메서드호출이 가능함/
        }


        
        bw.flush();
        br.close();
        bw.close();
    }
    
}
