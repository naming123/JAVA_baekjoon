package bj05.id_11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 자바는 런타임 변수명을 만드는 기능은 없음
        // => 리스트 선언으로 add와 함께 접근
        List<String> names = new ArrayList<>();
        
        String A;
        
                    
        while ((A = br.readLine()) != null) { // 예외상황에 대한 대비
            if (A.trim().isEmpty()) break; // 빈줄이 없어도 엔터만으로 종료가능하게 함
            names.add(A);
        }
            

        // System.out.println("앙");

        for(int i=0;i<names.size();i++){
            bw.write(names.get(i)+"\n"); // 이렇게 for과 함께 쓰는것이 맞는건지?
        }
        // System.out.println("앙1");
        
        bw.flush();
        bw.close();
        br.close();
    }
}
