package bj13.id_04;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] aa = br.readLine().split("\\s+");

        int N = Integer.parseInt(aa[0]);
        int k = Integer.parseInt(aa[1]);


        String[] score = br.readLine().split("\\s+");
        
        int[] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i] =Integer.parseInt(score[i]);

        }
        Arrays.sort(arr);
        System.out.println(arr[N-k]);

    }    

}
        