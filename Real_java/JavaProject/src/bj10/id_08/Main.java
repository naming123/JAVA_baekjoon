package bj10.id_08;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //====
        String[] aa=br.readLine().split(" ");
        int a=Integer.parseInt(aa[0]);
        int b=Integer.parseInt(aa[1]);
        int c=Integer.parseInt(aa[2]);
        

        int sum=a+b+c;
        if ((sum -max(a,b,c))*2-1>sum){
            System.out.println(sum);
        }else{
            System.out.println((sum -max(a,b,c))*2-1);
        }


    }

    static int max(int a, int b, int c){
        if (a<b){
            if(b<c){
                return c;
            }else{
                return b;
            }
        }else{
            if(a<c){
                return c;
            }else{
                return a;
            }
        }

    }




}
        