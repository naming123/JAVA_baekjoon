package bj14.id_03;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> there = new HashSet<>(); 
        for(int i =0; i<N;i++){
            String[] aa = br.readLine().split(" ");
            String name = aa[0];
            // System.out.println(aa[0]);
            // System.out.println(aa[1]);
            if ("enter".equals(aa[1])){  // 자바에서 ==는 문자열의 내용이 아니라 **참조(메모리 주소)**를 비교
                // System.out.println(aa[1]);
                if (there.contains(name)){
                    break;
                }else{
                    there.add(name);
                    // System.out.println(there);
                }
            } else if ("leave".equals(aa[1])){
                there.remove(name);
                // System.out.println(1+name);
            }
        }
        List<String> output = new ArrayList<>(there); // set을 정렬이 가능한 List로 바꾼다
        Collections.sort (output, Collections.reverseOrder()); 
        for (String ele : output) {
            bw.write(ele+"\n");
        }
        bw.flush();
        bw.close();
    }
}



