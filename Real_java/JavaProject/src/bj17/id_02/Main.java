package bj17.id_02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int a =1;
        
        for (int i =0; i<N;i++){
            a=a*2;
        }System.out.println(a);
    }
}

