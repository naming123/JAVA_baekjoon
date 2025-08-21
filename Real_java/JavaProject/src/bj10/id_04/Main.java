package bj10.id_04;

import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int의 최댓값 2147483647를 기억하자
        Long a = Long.parseLong(br.readLine()) * 4L;//4L로 안하고 4로 하면 int로 받는거다.
        System.out.println(a);
    }
}
        