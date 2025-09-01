package bj13.id_05;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        int[] arr = new int[10001];
        int max =0;
        int j;
        for (int i=0; i<N; i++){
            j =Integer.parseInt(br.readLine());
            arr[j]++;
            if (j>max) max = j;
        }
        // 주어진 배열 값이 작은 경우 카운팅 정렬을 사용해야함
        // 배열의 원소 값 자체가 작은 게 아니라, 원소가 가질 수 있는 최대값 범위가 좁다
        // => 호프만 코딩과 같은 맥락
        // Arrays.sort(arr);

        for (int i=0; i<=max; i++){
            while (arr[i]>0){
                bw.write(i+"\n");
                arr[i]--;
            }
        }


        bw.flush();
        bw.close();
        br.close();

    }
}
        
        