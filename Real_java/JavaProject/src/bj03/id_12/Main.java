package bj03.id_12;

import java.io.*;




public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String line;
        while((line=br.readLine()) != null) { // 이거는 기본적으로 알고 있어야함
            
            String[] parts = line.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            bw.write(a+b+"\n");
        }




        
        bw.flush();
        br.close();
        bw.close();
    }
    
}
