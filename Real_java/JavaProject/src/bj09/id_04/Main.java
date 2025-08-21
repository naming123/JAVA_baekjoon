package bj09.id_04;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());        
        String[] arr = br.readLine().split(" ");

        int count = 0;

        for (int j = 0; j < num; j++) {
            int x = Integer.parseInt(arr[j]);
            if (sosu(x)) {       // 사용자메서드 부르기 (return boolean)     
                count++; 
            }
        }

        System.out.println(count);
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
}

        