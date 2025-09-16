package bj06.id_02;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 리스트는 킹, 퀸, 룩, 비숍, 나이트, 폰으로 주어짐
        String[] AA = br.readLine().split(" ");
        
        String[] chesses = "1 1 2 2 2 8".split(" ");
        for (int i =0; i< AA.length; i++){
            System.out.println(AA[i]);
            AA[i]= String.valueOf(Integer.parseInt(chesses[i]) - Integer.parseInt(AA[i]));
            // bw.write();
        }
        // bw.flush();
        System.out.println(String.join(" ",AA));
        bw.close();
        br.close();
        
    } 
}
