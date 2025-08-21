package bj09.id_03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 10000번보다는 100번계산이 낫다.
        // => N/a, a를 동시 저장 

        while (true) { 
            int N = Integer.parseInt(br.readLine());
            if (N==-1){break;}
            
            int N_r = (int) Math.sqrt(N);


            ArrayList<Integer> a = new ArrayList<>();
            // System.out.println(N_r);

            int sum =0;
            for (int i=1;i<=N_r;i++){
                if (N%i==0){
                    // Arraylist
                    // 1. 크기에 상관없이 추가 가능
                    // 2. 인덱스 접근 가능
                    sum = sum+i+N/i;
                    a.add(i);
                    a.add(N/i);
                    if(i==N/i){sum= sum+i;} 
                }
            }

            // 오름차순으로 배열
            Collections.sort(a);  

            // int 배열의 출력형식을 바꾸고 싶을때
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < a.size()-1; i++) {
                if (i > 0) sb.append(" + ");  // unclosed character literal은?=> char공간에 string을 넣음
                sb.append(a.get(i));
            }
            // System.out.println(sb);
            
            // System.out.println(a.size());
            // 검사
            // System.out.println(sum-N);
            if (sum-N == N){
                System.out.println(N + " = "+ sb);
            }else{
                System.out.println(N+" is NOT perfect.");
            }
        }




    }
}
        