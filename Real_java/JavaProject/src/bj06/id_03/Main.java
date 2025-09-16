package bj06.id_03;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 리스트는 킹, 퀸, 룩, 비숍, 나이트, 폰으로 주어짐
        int A = Integer.parseInt(br.readLine());
        // System.out.println("a");
        for(int i=1;i<A;i++){
            System.out.println(" ".repeat(A-i)+"*".repeat(2 * i - 1)); // 오른쪽에도 공백을 찍는지 꼭 확인할것
        }

        for(int i=1;i<A+1;i++){
            System.out.println(" ".repeat(i -1)+"*".repeat(2*A-2*i+1));
        }
        // System.out.println("b");

        
        bw.close();
        br.close();
        
    } 
}
