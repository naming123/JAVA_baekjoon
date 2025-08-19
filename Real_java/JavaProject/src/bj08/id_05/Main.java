package bj08.id_05;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num =Integer.parseInt(br.readLine())-1;

        // 로직을 짜보자
        // n번째 줄은 n-1번째줄 * 2의 개수를 가진다.
        // a = 1+3n(n-1)
        int i=1;
        int a=1;
        while(num>=1){
            num=num-6*a;
            i++;
            a=a+1;
           
        }
        System.out.println(i);

    }
}

        