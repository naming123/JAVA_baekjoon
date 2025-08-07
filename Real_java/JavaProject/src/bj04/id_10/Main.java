package bj04.id_10;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Array생성
        int max = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String[] parts = line.split(" ");
        int M=0;
        for (int j=0;j<max;j++){
            if (M<Integer.parseInt(parts[j])){
                M=Integer.parseInt(parts[j]);
            }
        }
        // System.out.println(M);

        float a=0;
        for (int i=0;i<max;i++)
            a = Float.parseFloat(parts[i])+a;
        
        // System.out.println(a+"");
        Float b=a/max/M*100;
        System.out.println(b+"");



        br.close();

    }
    
}