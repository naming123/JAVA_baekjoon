package id_05;

import java.io.*;
import java.util.Scanner;
// import java.util;.*;



public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); //https://st-lab.tistory.com/41
        int A = sc.nextInt();
        // System.out.println("long "*A+"int");
        System.out.println("long ".repeat(A/4)+"int");// 이렇게 for을 안쓰더라도 반복문을 사용할 수 있다.
    }
}
