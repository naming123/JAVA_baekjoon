package bj09.id_03;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 10000번보다는 100번계산이 낫다.
        // => N/a, a를 동시 저장 (if문으로 k<a.length로 접근)

        String[] aa = br.readLine().split(" ");

        int N = Integer.parseInt(aa[0]);
        int N_r = (int) Math.sqrt(N);

        int K = Integer.parseInt(aa[1]);

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println(N_r);
        for (int i=1;i<=N_r;i++){
            if (N%i==0){
                // Arraylist
                // 1. 크기에 상관없이 추가 가능
                // 2. 인덱스 접근 가능
                a.add(i);
                if(i!=N/i){b.add(N/i);} 
            }
        }
        // System.out.println(a.size());
        // K접근
        if (K<a.size()){
            System.out.println(a.get(K-1));
        }else if (K-a.size()<b.size()){
            System.out.println(b.get(b.size()-K+a.size()));
        }else{
            System.out.println(0);
        }

        // 리스트로 받아서 인덱스뽑기



    }
}
        