package bj10.id_01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int a = Integer.parseInt(br.readLine());
       int b = Integer.parseInt(br.readLine());
       System.out.println(a*b);

    }    
    static int min2(int a, int b) {
        return (a < b) ? a : b;
    }
}
        