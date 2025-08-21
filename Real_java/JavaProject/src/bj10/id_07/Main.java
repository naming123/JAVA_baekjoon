package bj10.id_07;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //====
        String[] aa=br.readLine().split(" ");
        int a=Integer.parseInt(aa[0]);
        int b=Integer.parseInt(aa[1]);
        int c=Integer.parseInt(aa[2]);
        

        // 앞에서 먼저 받고
        while(a != 0 || b != 0 ||c!=0){ // 조건쓸때 띄어쓰기 잘할 것.
            System.out.println(triangle(a, b, c));;
            aa=br.readLine().split(" ");
            a=Integer.parseInt(aa[0]);
            b=Integer.parseInt(aa[1]);
            c=Integer.parseInt(aa[2]);
        }


    }

    static String triangle(int a, int b, int c){
        if (a==b&&b==c){
            return "Equilateral";
        }else{

            if(a+b+c<2*max(a,b,c)){
                return "Invalid";
            } else if(a==b||b==c||a==c){
                return "Isosceles";
            }else{
                return "Scalene";
            }
            
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
        