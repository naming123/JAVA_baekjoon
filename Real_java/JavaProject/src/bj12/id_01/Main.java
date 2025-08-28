package bj12.id_01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] pp = br.readLine().split(" ");

        int N = Integer.parseInt(pp[0]);
        int M = Integer.parseInt(pp[1]);

        String[] qq = br.readLine().trim().split("\\s+"); // 요렇게 쓰는 게 더 안정적인듯
        
        int sum =0;
        int sum1 =0;
        for (int i=0; i<N;i++){
            for (int j=0; j<N;j++){
                if (i==j)break;// 3장 뽑는것이므로 ijk가 달라야한다.
                for (int k=0; k<N;k++){
                    if (k==j)break;
                    sum1 = Integer.parseInt(qq[i])+Integer.parseInt(qq[j])+Integer.parseInt(qq[k]);
                    // if(sum1==M){
                    //     System.out.println(qq[i]+" "+qq[j]+" "+qq[k]);
                    // }
                    
                    if (sum1<=M&&sum1>sum){
                        sum = sum1;

                    } 
                    // System.out.println(sum);

                }
            }
        }System.out.println(sum);


    }    

}
        