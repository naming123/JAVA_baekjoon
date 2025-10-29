package bj17.id_04;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] aa=new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int N=Integer.parseInt(aa[0]);
        int k=Integer.parseInt(aa[1]);

        int a =1;
        int b=1;
        int c=1;
        
        for (int i =2; i<=N;i++){
            a=a*i;
            if (i==k){b=a;}
            if (i==N-k){c=a;}
        }System.out.println(a/b/c);
    }
}

