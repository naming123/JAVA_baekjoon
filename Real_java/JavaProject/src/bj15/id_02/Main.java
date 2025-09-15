package bj15.id_02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   

        String[] aa = br.readLine().split(" ");
        long a = Long.parseLong(aa[0]); // Long vs long
        long b = Long.parseLong(aa[1]);

        if (a>b){
            System.out.println(a*b/GCD(a,b));
        }else{
            System.out.println(a*b/GCD(b,a));
        }

    }
    static Long GCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
