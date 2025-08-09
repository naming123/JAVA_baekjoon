package bj05.id_09;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        

        String[] parts = br.readLine().split(" ");

        String A = parts[0];
        char[] As = A.toCharArray();
        String B = parts[1];
        char[] Bs = B.toCharArray(); //문자열로 바꿔서 하나씩 접근

        // 바꾸기
        char temp = As[0];
        As[0] = As[2];
        // As[1] = As[2];
        As[2] = temp;

        char temp1 = Bs[0];
        Bs[0] = Bs[2];
        // Bs[1] = Bs[2];
        Bs[2] = temp1;

        // 크기 비교

        if (Integer.parseInt(String.valueOf(As))>Integer.parseInt(String.valueOf(Bs))){
            System.out.println(As);
        }else{
            System.out.println(Bs);
        }
        

        
      

        
        // bw.flush();
        // bw.close();
        br.close();
    }
}
