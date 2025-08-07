package bj04.id_08;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a;
        Set<String> namuji = new HashSet<>(); // 가장 기본적인 set이다.
        // readline을 해서 
        for (int j =1;j<=10;j++){
            a = br.readLine();
            int b = Integer.parseInt(a);
            namuji.add(String.valueOf(b%42));// set의 요소들을 다 42로 나눈나머지로 넣은 다음
            // 데이터타입 변경이나 변수이름 긴것은 메모리에 영향을 주나?
        }
        
        
        System.out.println(namuji.size()); // set의 개수를 얻는다.

        br.close();

    }
    
}