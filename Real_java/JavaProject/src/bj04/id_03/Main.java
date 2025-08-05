package bj04.id_03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int num = Integer.parseInt(line);

                
        String line2 = br.readLine();
        String[] parts2 = line2.split(" ");
        int max = Integer.parseInt(parts2[0]);
        int min = Integer.parseInt(parts2[0]);

        for (int i =0; i<num;i++){
            int a = Integer.parseInt(parts2[i]);
            if(a>max){
                max = a;
            }
            if(a<min){
                min = a;
            }
        }

        System.out.println(min +" "+ max);
        br.close();

    }
    
}
