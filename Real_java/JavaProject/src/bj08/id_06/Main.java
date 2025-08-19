package bj08.id_06;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num =Integer.parseInt(br.readLine());

        // n phase계산
        // System.out.println("num="+num);
        int a=0;
        int n=0;
        while(num>0){
            num=num-a;
            n++;
            a=a+1;
        }

        n=n-1;
        a=a-1;
        num=num+a;
        // System.out.println("n="+n);
        // System.out.println("a="+a);
        // System.out.println("num="+num);

        // n이 홀수면 왼쪽부터, 짝수면 오른쪽부터 
        if (n%2==1){
            System.out.println((a+1-num)+"/"+(num));
        }else{
            System.out.println((num)+"/"+(a+1-num));
        }
        
    }
}

        