package bj03.id_11;

import java.io.*;




public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) { // 조건이 없더라도(추후 조건생성인 경우) 이렇게 반복 가능
            String line = br.readLine();
            if (line.equals("0 0")) break;  // 문자열은 ==가아니라 equals사용

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
