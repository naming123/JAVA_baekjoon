package bj07.id_02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        
        int[][] input = new int[9][9];
        int[][] arr = new int[9][9];

        for (int A =0; A<9; A++){
            String[] A0 =br.readLine().split(" ");
            for (int A1 =0;A1<9;A1++){
                
                input[A][A1]= Integer.parseInt(A0[A1]);
                
            }
        }


        int max=0;
        String[] a = new String[2];
        for (int i =0;i<9;i++){
            for (int j =0;j<9;j++){
                if (input[i][j]>=max){ // =가 없다면 모두 0인 행렬이 들어올 때 좌표 업데이트가 안되어서 null을 반환하게 됨
                    max = input[i][j]; 
                    a[0]=String.valueOf(i+1);
                    a[1]=String.valueOf(j+1);
                    // System.out.println(input[i][j]);
                    // System.out.println(max);

                }               
            }

        }
        System.out.println(max);
        System.out.println(String.join(" ",a));

    }
}

        