package bj10.id_01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        
        // 무조건 첫번째 숫자를 기준으로 한다.
        // 그러면 1 1인 경우는 어떻게 설정해야하는거지? => 두 수가 같은 경우는 없다

        while (true){
            String[] a =br.readLine().split(" ");
            int A = Integer.parseInt(a[0]);
            int B = Integer.parseInt(a[1]);
            int mu=0; 
            if (A == 0 && B == 0){
                mu =1;
                return;  // vs Break
            }
            // System.out.println(1);
            if (mu!=1){
                if (B%A==0){
                    System.out.println("factor");
                }else if(A%B==0){
                    System.out.println("multiple");
                }else{
                    System.out.println("neither");
                }
            }
            // System.out.println(2);
        }



    }
}
        