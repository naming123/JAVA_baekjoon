package bj15.id_01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i =0; i<T;i++){
            String[] aa = br.readLine().split(" ");
            int a = Integer.parseInt(aa[0]);
            int b = Integer.parseInt(aa[1]);

            if (a>b){
                System.out.println(a*b/GCD(a,b));
            }else{
                System.out.println(a*b/GCD(b,a));
            }
        }


       
    }
    static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
        