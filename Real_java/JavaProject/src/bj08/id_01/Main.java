package bj08.id_01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a =br.readLine().split(" ");
        
        int[][] aa = new int[Integer.parseInt(a[0])][Integer.parseInt(a[1])];
        int[][] bb = new int[Integer.parseInt(a[0])][Integer.parseInt(a[1])];
        int[][] arr = new int[Integer.parseInt(a[0])][Integer.parseInt(a[1])];

        for (int A =0; A<Integer.parseInt(a[0]); A++){
            String[] A0 =br.readLine().split(" ");
            for (int A1 =0;A1<Integer.parseInt(a[1]);A1++){
                
                aa[A][A1]= Integer.parseInt(A0[A1]);
                // System.out.println(aa[A][A1]+"a");
                // System.out.println(A+" "+A1);
                
            }
        }
        // System.out.println(aa);

        for (int B =0; B<Integer.parseInt(a[0]); B++){
            String[] B0 =br.readLine().split(" ");
            for (int B1 =0;B1<Integer.parseInt(a[1]);B1++){
                
                bb[B][B1]= Integer.parseInt(B0[B1]);
                // System.out.println(bb[B][B1]);
            }
        }
        // System.out.println(bb);


        for (int i =0;i<Integer.parseInt(a[0]);i++){
            for (int j =0;j<Integer.parseInt(a[1]);j++){
                arr[i][j]= aa[i][j] + bb[i][j];                
            }

        }

        for (int i =0;i<Integer.parseInt(a[0]);i++){
            for (int k = 0; k < Integer.parseInt(a[1]); k++) {
                System.out.print(arr[i][k] + " ");

            }System.out.println();

        }
        
    }
}

        