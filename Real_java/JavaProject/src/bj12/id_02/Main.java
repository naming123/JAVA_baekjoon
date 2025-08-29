package bj12.id_02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int ans=0;
        for (int i=1; i<=N; i++){
            if (isGen(i,N)>0){
                ans=i;
                // System.out.println(i);
            }
            if (ans>0)break;
        }System.out.println(ans);
        // 256 = 245 + 2 + 4 + 5

    }    

    static int isGen(int a, int b){
        String A = String.valueOf(a);
        int sum = a;
        for (int i = 0; i < A.length(); i++) {
            int digit = A.charAt(i) - '0';  // 문자 → 숫자 변환
            sum = digit +sum;
        }
        if (b==sum){
            return a;
        }else{
            return 0;
        }
    }


}
        