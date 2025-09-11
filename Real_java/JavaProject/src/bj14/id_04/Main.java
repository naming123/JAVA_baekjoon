package bj14.id_04;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] ab = br.readLine().split(" ");
        int N = Integer.parseInt(ab[0]);   // 리스트 개수
        int M = Integer.parseInt(ab[1]);   // 질의 개수

        // 번호 -> 이름
        String[] idxToName = new String[N + 1];
        // 이름 -> 번호
        Map<String, Integer> nameToIdx = new HashMap<>(N * 2);

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            idxToName[i] = name;
            nameToIdx.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String q = br.readLine();
            // 숫자/문자 빠르게 판별 (예외 사용 X)
            if (Character.isDigit(q.charAt(0))) {
                int idx = Integer.parseInt(q);
                sb.append(idxToName[idx]).append('\n');
            } else {
                sb.append(nameToIdx.get(q)).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}

// public class Main {

//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         String[] ab = br.readLine().split(" ");
//         int list =Integer.parseInt(ab[0]); 
//         int problem =Integer.parseInt(ab[1]);

//         // 첫글자만 대문자고 나머지는 소문자
//         // 최대길이는 20, 최소길이는 2
//         Set<String> set = new LinkedHashSet<>();
//         for (int i =0;i<list;i++){
//             set.add(br.readLine());
//         }

//         // LinkedHashSet → List 변환
//         List<String> lists = new ArrayList<>(set);

//         // 문제) 숫자면 이름, 이름이면 숫자
//         for (int i=0;i<problem;i++){
//             String input = br.readLine();
//             try {
//                 int number = Integer.parseInt(input)-1;  
//                 bw.write(lists.get(number)+"\n");
//             } catch (NumberFormatException e) { // 숫자를 못 바꾸는지 검사
//                 bw.write(lists.indexOf(input)+1+"\n");
//             }
//         }
//          => indexOf는 웬만하면 쓰지말자, 타입 search도 비효율적이다 (굳이 다 안 볼 필요가 없다)


//         bw.flush();
//         bw.close();
//     }
// }










