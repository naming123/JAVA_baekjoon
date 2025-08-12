package bj06.id_05;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String AA = br.readLine().toUpperCase(Locale.ROOT);

        List<Character> uniques = new ArrayList<>();
        for (int i = 0; i < AA.length(); i++) {
            char ch = AA.charAt(i);
            if (!uniques.contains(ch)) {    
                uniques.add(ch);
            }
        }   // 중복방지 리스트 만들기


        int max = 0;
        char ab = '?';
        boolean tie = false;

        for (int a = 0; a < uniques.size(); a++) {
            char u = uniques.get(a);
            int cnt = 0;
            for (int i = 0; i < AA.length(); i++) {
                if (AA.charAt(i) == u) cnt++;
            }

            if (cnt > max) {       
                max = cnt;
                ab = u;
                tie = false;
            } else if (cnt == max) {
                tie = true;        // 3 3 5에 대한 이해
            }
        }

        
        System.out.println(tie ? "?" : ab); // 조건으로 sout할 수 있음
        

        br.close();
        
    } 
}
