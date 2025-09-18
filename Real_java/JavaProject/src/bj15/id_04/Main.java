package bj15.id_04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        // list만들기<int>
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        int M0 = Integer.parseInt(br.readLine());
        int M1=M0;
        // list 에 넣기
        list.add(M0);
        int M = Integer.parseInt(br.readLine()); // M>M0
        list.add(M);
        int gcd=M-M0;
        int M2=0;
        for (int i=0;i<N-2;i++){
            M = Integer.parseInt(br.readLine());          
            list.add(M);
            gcd=GCD(M-M0,gcd);
            
            M0=M;// 지난것이 M0가 됨
            if (i==N-3){
                M2=M;
            }
        }
        
        
        
        // 원래 필요한것
        int all = (M2- M1)/gcd;
        
        // list에서 있는것
        int cnt=0;
        for(int j=0;j<N;j++){
            int a=list.get(j);
            if ((a-M1)%gcd==0){
                cnt++;
                
            }
        }
        
        System.out.println(all-cnt+1);


    }

    static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
