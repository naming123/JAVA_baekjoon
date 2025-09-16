package bj04.id_05;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] parts = line.split(" ");
        int SIZE = Integer.parseInt(parts[0]);
        int max = Integer.parseInt(parts[1]);
        
        String[] list = new String[SIZE]; // Array vs ArrayList



        for (int i_0=0; i_0<max; i_0++){
            String line2 = br.readLine();
            String[] parts2 = line2.split(" ");
            int i = Integer.parseInt(parts2[0]);
            int j = Integer.parseInt(parts2[1]);
            String k = parts2[2];
            
            
            
            for (int j_1 =i-1; j_1<j;j_1++){
                list[j_1]=k;
                // System.out.println(Arrays.toString(list));
            }
        }
        for (int i = 0; i < list.length; i++) { // NULL을 0으로 바꾸기
            if (list[i] == null) {
                list[i] = "0";
            }
        }


        System.out.println(String.join(" ",list)); // 리스트를 배열하는 방법을 알아보자
        br.close();

    }
    
}