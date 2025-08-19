package bj08.id_03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num =Integer.parseInt(br.readLine());
        // 여기서 힌트로 나온 “Don’t look back in anger”(오아시스의 노래 제목)는 
        //뒤돌아보며 후회하지 말라 → 즉, 거꾸로(큰 단위 말고 작은 단위부터) 계산하지 말라는 의미예요.
         
        
        StringBuilder sb = new StringBuilder();

        for (int i=0;i < num; i++){
            int input =Integer.parseInt(br.readLine());
            sb.append(input/25);
            sb.append(" "); 
            input = input%25;
            sb.append(input/10);
            sb.append(" "); 
            input = input%10;
            sb.append(input/5);
            sb.append(" "); 
            input = input%5;
            sb.append(input/1);
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }
}

        