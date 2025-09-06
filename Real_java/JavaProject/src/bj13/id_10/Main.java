package bj13.id_10;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][3]; // arr는 String[]을 담는 배열


		for (int i =0; i<N;i++){
			String[] aa =  br.readLine().split(" ");
            arr[i][0] = aa[0];            // age (문자열 형태로 저장)
            arr[i][1] = aa[1];            // name
            arr[i][2] = String.valueOf(i);// 입력 순서	
		}
		

		Arrays.sort(arr, new Comparator<String[]>() {
            
			public int compare(String[] s1, String[] s2) {
				// 나이가 같을 경우 
				if (s1[0] != s2[0]) {
					return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]); // 같으면 사전순으로 배열
				} 
				// 그 외의 경우 
				else {
					return  Integer.parseInt(s1[2]) -  Integer.parseInt(s2[2]);
				}
			}
		});
		
		for (int i = 0; i < arr.length; i++) {        // 행 반복
			System.out.print(arr[i][0] + " "+arr[i][1]);
			System.out.println(); // 한 행 끝나면 줄바꿈
		}
		
	}
}
        
        