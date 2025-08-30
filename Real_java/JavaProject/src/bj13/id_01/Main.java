package bj13.id_01;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        // array 선언
        int[] arr = new int[num];

        for (int i=0; i<num;i++){
            arr[i] =Integer.parseInt(br.readLine());

        }
        Arrays.sort(arr);

        // 변수 scope가 전역이 아니므로, i를 한번 더 사용해도 됨
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }    

}
        