package bj15.id_09;

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        int cnt=0;
        // for문
        for (int i =1; i*i<=N; i++){
            cnt++;
        }
        System.out.println(cnt); 
    }


}
