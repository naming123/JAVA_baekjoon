package bj13.id_11;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		

		String[] aa = br.readLine().split(" ");
		// set으로  배열
		List<String> list = new ArrayList<>(new HashSet<>(Arrays.asList(aa))); // set만으론 배열접근이 안됨
		Integer[] sort = new Integer[list.size()];
		// int vs Integer 배열

		
		for (int i=0; i<list.size();i++){
			sort[i]=Integer.parseInt(list.get(i));
		}Arrays.sort(sort);
		StringBuilder sb = new StringBuilder();
		// for (int i=0; i<N;i++){
		// 	aa[i] = String.valueOf(Arrays.asList(sort).indexOf(Integer.parseInt(aa[i])));
		// 	sb.append(aa[i]+" ");
		// }
		// => indexOf와 for조합은 시간복잡도가 매우 큼 (O(N^2))
		Map<Integer,Integer> rank = new HashMap<>(sort.length);
		for (int i = 0; i < sort.length; i++) rank.put(sort[i], i);
		// => Map으로 대체하면 NlogN으로 감소

		for (int i = 0; i < N; i++) {
			int v = Integer.parseInt(aa[i]);
			sb.append(rank.get(v)).append(' ');
		}
		
		
		bw.write(sb.toString().trim());
		bw.flush();
		


	}
}
        
        