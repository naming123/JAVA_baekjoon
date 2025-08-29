package bj12.id_03;

import java.io.*;

public class Main {
    static int a,b,c,d,e,f; // class변수 선언(scope를 잘 이해하자)
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] A = br.readLine().trim().split("\\s+");

        a= Integer.parseInt(A[0]);
        b= Integer.parseInt(A[1]);
        c= Integer.parseInt(A[2]);
        d= Integer.parseInt(A[3]);
        e= Integer.parseInt(A[4]);
        f= Integer.parseInt(A[5]);



        for (int x=-999;x<1000;x++){
            for (int y=-999;y<1000;y++){
                if(equ1(x,y) && equ2(x,y)){
                    System.out.println(x+" "+y);
                }
            }
        }

        // 만약 연립방정식의 해가 2개면? (배수의 계수일때?)
        // => 일단 2개일 때의 출력을 고려안하는 문제로 보임

    } 
    // ax+by=c
    // dx+ey=f   
    static boolean equ1(int x, int y){
        return a*x + b*y == c;
    }
    static boolean equ2(int x, int y){
        return d*x + e*y == f;
    }

}
        