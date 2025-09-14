package bj14.id_08;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String aa = br.readLine();

        Set<String> set = new HashSet<>();
        // => 여기서 map을 쓰는거 같은데, 아니면 set으로 contains쓰라는건가?
        for (int i =0; i< aa.length();i++){// 시작점
            for (int j =i+1; j<= aa.length();j++){ // 종료점
                set.add(aa.substring(i,j));
            }
        }
        System.out.println(set.size());

    }
}

