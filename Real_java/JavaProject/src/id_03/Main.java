package id_03;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number1 = br.readLine();
        int number = Integer.parseInt(number1);
        String line;
        String[] parts;
        for (int i=0;i<number;i++){
            line= br.readLine();
            parts = line.split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            System.out.println(A+B);
        }
        br.close();
    }
}
