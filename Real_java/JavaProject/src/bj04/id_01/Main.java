package bj04.id_01;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number1 = br.readLine();
        int number = Integer.parseInt(number1); // 그냥 리스트처리하면 이걸 받을 필요가 없지 않을까?
        

        String line = br.readLine();
        String[] parts = line.split(" ");
        ArrayList<String> AA = new ArrayList<>(Arrays.asList(parts));

 

        String ch = br.readLine();
        // int count = Collections.frequency(AA, ch); // 이건 문제의 의도가 아닌것 같음
        int count =0;
        for (int i=0;i<number;i++){
            if (AA.get(i).equals(ch)){
                count++;
            }
        }



        bw.write(String.valueOf(count)); // sout이 더 맞는거 같음
        bw.flush();
        br.close();

        bw.close();
    }
    
}
