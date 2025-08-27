package bj11.id_05;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine()); // N^2을 할 때는 long습관화를 하자
        System.out.println(n*n*n); //  for을 3번 반복하는 것이므로 n^3이라고 볼 수 있다.
        System.out.println(3); //  n에 대하여 3차적인 관계를 가진다고 볼 수 있다.

    }    

}
        
