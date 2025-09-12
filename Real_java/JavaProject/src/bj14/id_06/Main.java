package bj14.id_06;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] aa = br.readLine().split(" ");
        int N =Integer.parseInt(aa[0]);
        int M =Integer.parseInt(aa[1]);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String key = br.readLine();
            map.put(key, 1);

        }
        int cnt =0;
        for (int i = 0; i < M; i++) {
            String key = br.readLine();
            if (map.containsKey(key) && map.get(key)==1) { 
                map.put(key, 2);
                cnt++;
            }
        }

        List<String> keys = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) { // entryset vs keyset
            if (entry.getValue() == 2) {
                keys.add(entry.getKey());
            }
        }

        // 사전순 정렬 (compareTo 이용)
        Collections.sort(keys, (a, b) -> a.compareTo(b));

        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            sb.append(key).append("\n");
        }

        System.out.println(cnt);
        System.out.println(sb.toString());

    }
}


// // 나중에 살펴볼 코드
// import java.util.Set;
// import java.util.HashSet;
// import java.util.List;
// import java.util.ArrayList;

// public class Main {
// 	static final int SIZE = 1 << 13;
//     static byte[] buffer = new byte[SIZE];
//     static byte[] string = new byte[20];
//     static int index, size;

//     static int nextInt() throws Exception {
//         int n = 0;
//         byte c;
//         while ((c = read()) <= 32);
//         do n = (n << 3) + (n << 1) + (c & 15);
//         while ((c = read()) > 47 && c < 58);
//         return n;
//     }

//     static String next() throws Exception {
//         while (read() <= 32);
//         int i = 0;
//         do string[i++] = buffer[index - 1];
//         while (read() > 64);
//         return new String(string, 0, i);
//     }

//     static byte read() throws Exception {
//         if (index == size) {
//             size = System.in.read(buffer, index = 0, SIZE);
//             if (size < 0) buffer[0] = -1;
//         }
//         return buffer[index++];
//     }
    
// 	public static void main(String... args) throws Exception {
// 		StringBuilder sb = new StringBuilder();
// 		int N = nextInt(), M = nextInt(), cnt = 0;
		
// 		Set<String> set = new HashSet<>();
// 		List<String> list = new ArrayList<String>();
		
// 		while(N-- > 0)
// 			set.add(next());
// 		while(M-- > 0) {
// 			String s = next();
// 			if(set.contains(s)) {
// 				cnt++;
// 				list.add(s);
// 			}
//         }
		
// 		list.sort((a, b) -> {
// 			return a.compareTo(b);
// 		});
		
// 		sb.append(cnt).append("\n");
// 		for(String s : list) {
// 			sb.append(s).append("\n");
// 		}
// 		System.out.println(sb);
// 	}
// }
