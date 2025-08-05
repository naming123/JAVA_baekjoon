package bj03.id_03;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 여러개를 입력받을 때 빠른것이다. 하나받을 땐 오버엔지니어링이다.
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number1 = br.readLine();
        
        int number =Integer.parseInt(number1);
        // String[] parts;
        int A=0;
        for (int i=0;i<=number;i++){
            A = i+A;
        }System.out.println(A+"");
        br.close();
    }
}
