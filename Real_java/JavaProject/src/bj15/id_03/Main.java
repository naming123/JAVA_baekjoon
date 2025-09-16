package bj15.id_03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   

        String[] aa = br.readLine().split(" ");
        int a1 = Integer.parseInt(aa[0]);
        int a2 = Integer.parseInt(aa[1]);
        String[] bb = br.readLine().split(" ");
        int b1 = Integer.parseInt(bb[0]);
        int b2 = Integer.parseInt(bb[1]);

        int a = a1*b2+a2*b1;
        System.out.println(a);
        int b =a2*b2;
        System.out.println(b);

        System.out.println(a/GCD(a,b)+" "+b/GCD(a,b));



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
