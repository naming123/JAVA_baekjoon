package bj13.id_09;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 중복을 없애야한다
        // append시켰을때 중복을 안받는 배열?
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		// https://st-lab.tistory.com/112 => 다시 한번 톺아보자
        // override와 (compare를 이용한) 람다식 만들기
		Arrays.sort(arr, new Comparator<String>() {
            @Override// 이 어노테이션을 잘 사용해야된다.
			public int compare(String s1, String s2) {// compare라는 함수를 이용해 단어길이를 가지고 sort하는 comparator객체를 만들었다
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2); // 같으면 사전순으로 배열
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();// 양수냐 음수냐에 따라 comparator가 어떤 순으로 반환할지 정한다.
				}
			}
		}); // 람다식을 사용하여 조건을 가진 sort를 할 수도 있다. 
        // => 길이 우선 → 같은 길이는 알파벳순

		StringBuilder sb = new StringBuilder();
 
		sb.append(arr[0]).append('\n');
        // 첫원소는 중복을 가지지 않기 때문에 equals를 사용할 수 없어서 따로 해야됨
		
		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {// 중복 없앤다
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);
	
    }
}
        
        