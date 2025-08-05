package bj04.id_02;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] parts = line.split(" ");
        int num = Integer.parseInt(parts[0]);
        int max = Integer.parseInt(parts[1]);
                
        String line2 = br.readLine();
        String[] parts2 = line2.split(" ");


        ArrayList<String> list = new ArrayList<String>();
        for (int i =0; i<num;i++){
            int a = Integer.parseInt(parts2[i]);
            if(a<max){
                list.add(String.valueOf(a));
            }
        }

        System.out.println(String.join(" ",list));
        br.close();

    }
    
}
