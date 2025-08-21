package bj09.id_05;

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

               
        int M = Integer.parseInt(br.readLine()); 
        int N = Integer.parseInt(br.readLine()); 


        int sum = 0;
        int min = N+1;
        for (int x = M; x <= N; x++) {
            if (sosu(x)) {
                sum += x;
                if (x < min) min = x;
            }
        }
        out(sum, min);


    }

    // public은 외부 패키지에 공개할 생각이 있을때
    // void가 아닌 특정 return을 위한 메서드를 따로 정의하는 연습을 하자
    public static boolean sosu(int n) {
        if (n < 2) return false;       
        if (n == 2) return true;       
        if (n % 2 == 0) return false;  

        int r = (int) Math.sqrt(n);
        for (int d = 3; d <= r; d += 2) {
            if (n % d == 0) return false;
        }
        return true;
    }

    public static void out(int sum, int min) {
        if (sum!=0){
            System.out.println(sum);
            System.out.println(min);
            
        }else{
            System.out.println(-1);
        }
    }
        
}

        