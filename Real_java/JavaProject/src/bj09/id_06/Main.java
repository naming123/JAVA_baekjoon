package bj09.id_06;

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

               
        int N = Integer.parseInt(br.readLine()); 

        for (int x = 2; x <= N; x++) {
            if (sosu(x)) {
                while(N%x==0){
                    N=N/x;
                    System.out.println(x);
                }

            }
        }


    }

    // public은 외부 패키지에 공개할 생각이 있을때
    // void가 아닌 특정 return을 위한 메서드를 따로 정의하는 연습을 하자
    public static boolean sosu(int n) {      
        if (n == 2) return true;       
        if (n % 2 == 0) return false;  

        int r = (int) Math.sqrt(n);
        for (int d = 3; d <= r; d += 2) {
            if (n % d == 0) return false;
        }
        return true;
    }

        
}

        