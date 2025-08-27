package bj11.id_06;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine()); // N^2을 할 때는 long습관화를 하자
        System.out.println(n*(n-1)*(n-2)/6); //  for을 3번 반복하지만, 곱의 연산으로 3!을 나눠야한다.
        System.out.println(3); //  n에 대하여 3차적인 관계를 가진다고 볼 수 있다.

    }    

}
        
