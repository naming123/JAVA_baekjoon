package bj10.id_02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        
       String[] a = br.readLine().split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        int w = Integer.parseInt(a[2]);
        int h = Integer.parseInt(a[3]);
       int ans = min2( min2(x, y), min2(w - x, h - y) );


        

        System.out.println(ans);
    }    
    static int min2(int a, int b){
        if (a<b){
            return a;
        }else{
            return b;
        }

    }
}
        