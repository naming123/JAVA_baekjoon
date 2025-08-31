package bj13.id_02;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // array 선언
        int[] arr = new int[5];
        int sum =0;
        for (int i=0; i<5; i++){
            arr[i] =Integer.parseInt(br.readLine());
            sum = sum +arr[i];

        }
        Arrays.sort(arr); // 오름차순으로 정렬

        System.out.println(sum/5);
        System.out.println(arr[2]);

    }    

}
        