package bj05.id_01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String number1 = br.readLine();
        int number = Integer.parseInt(number1);
        char st = line.charAt(number-1); // toCharArray();처럼 객체를 생성할 때는 반복할 때 필요
        

        bw.write(st);
        br.close();
        bw.flush();
        bw.close();
    }
    
}
