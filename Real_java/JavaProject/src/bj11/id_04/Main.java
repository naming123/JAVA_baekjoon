package bj11.id_04;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine()); // N^2을 할 때는 long습관화를 하자
        System.out.println(n*(n-1)/2); //  sum을 하기 위해서는 n개의 모든수에 접근해야하므로 n번이다.
        System.out.println(2); //  n에 대하여 1차적인 관계를 가진다고 볼 수 있다.

    }    

}
        