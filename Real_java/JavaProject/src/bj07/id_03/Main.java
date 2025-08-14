package bj07.id_03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // for 5를 하고
              
        
        String[][] input = new String[5][15];
        

        for (int A =0; A<5; A++){
            String[] A0 =br.readLine().split(" ");
            for (int A1 =0;A1<9;A1++){
                input[A][A1]= A0[A1];
                System.out.println(input[A][A1]);
            }
        }
        

        // 그 글자 개수만큼 for문 돌려서 ji거꾸로 해서 출력
        for (int i =0;i<Integer.parseInt(a[0]);i++){
            for (int k = 0; k < Integer.parseInt(a[1]); k++) {
                if (input[i][k]!=null)
                System.out.print(arr[i][k]);

            }System.out.println();

        }
        

    }
}

        