package bj05.id_07;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        
        String s =br.readLine();
        String[] arr = new String[26];

        
        for (int i=97; i<26+97; i++){
            char ch = (char) i;
            arr[i-97] = String.valueOf(s.indexOf(ch)); // 가장 첫번째 인덱스를 포함하고 없으면 -1 출력
            // System.out.println(arr[i-97]);
        }
        bw.write(String.join(" ", arr));
        bw.flush();
        br.close();
        
        bw.close();
    }
    
}
