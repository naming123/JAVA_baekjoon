package bj04.id_07;

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = new String[30];
        Arrays.fill(list, "1"); // 굳이 for로 채우지 않아도 됨
        String a;


        for (int j =1;j<=28;j++){ // indexOf를 지원하지 않는다니..
            a = br.readLine();
            // list[Arrays.asList(list).indexOf(a+"")]="0";
            list[Integer.parseInt(a)-1]="0";
        }


        for (int k=0;k<30;k++){
            if (list[k].equals("1")){
                System.out.println(k+1);   
            }
        }

        // System.out.println(String.join(" ",list)); 
        br.close();

    }
    
}