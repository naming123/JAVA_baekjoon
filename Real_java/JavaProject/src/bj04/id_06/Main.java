package bj04.id_06;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] parts = line.split(" ");
        int SIZE = Integer.parseInt(parts[0]);
        int max = Integer.parseInt(parts[1]);
        
        String[] list = new String[SIZE];
        String a ;

        for (int n = 0; n < list.length; n++) {
            list[n] = String.valueOf(n+1); // 이거 자주 쓸거 같은데 자주 쓰는게 맞는지 모르겠음
        }



        for (int i_0=0; i_0<max; i_0++){
            String line2 = br.readLine();
            String[] parts2 = line2.split(" ");
            int i = Integer.parseInt(parts2[0])-1;
            
            int j = Integer.parseInt(parts2[1])-1;
            
            a = list[i];
            

            list[i] =list[j];

            list[j]=a;

            

        }
        for (int i = 0; i < list.length; i++) { // NULL을 0으로 바꾸기
            if (list[i] == null) {
                list[i] = "0";
            }
        }


        System.out.println(String.join(" ",list)); 
        br.close();

    }
    
}