package bj04.id_04;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a;
        int max =0;
        int count = 0;
        int i =0;
        for(i=1;i<10;i++){
            a = br.readLine();
            int b = Integer.parseInt(a);

            if(b>max){
                max = b;
                count=i;

            }
            
        } // 3.11번 참고
        System.out.println(max);
        System.out.println(count);
        br.close();

    }
    
}
