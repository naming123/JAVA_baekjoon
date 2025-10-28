package bj18.id_02;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> seen = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine().trim();
            if (s.equals("ENTER")) {
                seen.clear();              // 새로 입장한 사람들만 다시 집계
            } else {
                if (seen.add(s)) count++;  // 처음 채팅한 닉네임만 카운트
            }
        }

        System.out.println(count);
    }
}
