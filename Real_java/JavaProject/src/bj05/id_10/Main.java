package bj05.id_10;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 대문자가 들어왔을 때 -'A'하고 /3+2하고 몫으로 번호 설정
        String A = br.readLine();  

        int B =0;
        // charAt와 substring의 차이 비교 필수
        // substring은 아스키변환이 안됨.
        for (int i=0;i<A.length();i++){
            if (A.charAt(i) == 'S' || A.charAt(i) == 'V' || A.charAt(i) == 'Y' || A.charAt(i) == 'Z'){ // 문제를 꼼꼼히 보자
                B = ((A.charAt(i) - 'A') / 3 + 2)+B;
                // System.out.println(A.charAt(i) - 'A');
                // System.out.println(B);
            }else{
                B = ((A.charAt(i) - 'A') / 3 + 3)+B;
                // System.out.println((A.charAt(i) - 'A'));
                // System.out.println(B);
            }
            
        }
        bw.write(B+""); // +"" 이거 절대 잊지말자 (bw와 sout의 차이)
        
        bw.flush();
        bw.close();
        br.close();
    }
}
