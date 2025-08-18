// package bj08.id_02;

import java.io.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a =br.readLine().split(" ");
        
        
        int num = Integer.parseInt(a[1]);

        
        // 아스키로 접근하는 것이 더 이로울 것이다.
        // 0~9 : 48~57
        // A~Z: 65~90 (둘이 붙어 있지 않으므로 if로 따로 비교 필요)
        
        int n = a[0].length(); // a[0]의 길이를 구해서 for문의 마지막
        long sum =0;
        long pow=1;
        // %를 이용해보자 (나머지구하기)
        for (int i=0; i< n; i++){
            sum = map.get(a[0].charAt(n-i-1))*(long)Math.pow(num, i)+sum; // ^i(XOR)가 제곱이 아니라 pow를 써야한다. (이는 double을 출력하기 때문에 출력형식을 유의해야한다.)
            // System.out.println(num);
            // System.out.println(num^i);
            // System.out.println(a[0]);
            // System.out.println(a[0].charAt(i)); // 자기가 맵을 char를 썼는지, string을 썼는지 제대로 이해하자.
            // System.out.println(map.get(a[0].charAt(i)));

        }System.out.println(sum);



    }
}

        