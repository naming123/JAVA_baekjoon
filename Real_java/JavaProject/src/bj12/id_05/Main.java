package bj12.id_05;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int cnt =0;
        int num=666;

        while (true) {
            if (jongmal(num)>0) { // num 안에 666이 있으면
                cnt++;
                if (cnt == a) { // 원하는 a번째라면 출력하고 종료
                    System.out.println(num);
                    break;
                }
            }
            num++; 
        }

    }

    // char[i]가 6이라면? => char[i+1]이 6이라면? => char[i+2]가 6이라면?
    static int jongmal(int a) {
        if (String.valueOf(a).contains("666")){
            return a;
        }else{
            return 0;
        }
    }
}
        