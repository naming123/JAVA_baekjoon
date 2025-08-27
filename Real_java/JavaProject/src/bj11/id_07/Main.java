package bj11.id_07;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] aa = br.readLine().split("\\s+"); 
        int a = Integer.parseInt(aa[0]);
        int b = Integer.parseInt(aa[1]);

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        // f(n)=an+b
        // g(n)=n
        if (a*n0+b<=c*n0 && a<=c){
            System.out.println(1);
        }else{
            System.out.println(0);
        }


    }   


}
        
