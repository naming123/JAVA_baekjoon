package bj06.id_08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Map을 써보자
        Map<String, Double> grade = new HashMap<>() {{
            put("A+", 4.5);
            put("A0", 4.0);
            put("B+", 3.5);
            put("B0", 3.0);
            put("C+", 2.5);
            put("C0", 2.0);
            put("D+", 1.5);
            put("D0", 1.0);
            put("P", 0.0);
            put("F", 0.0);
        }};
        double sum =0;
        double j=0.0;
        for (int i=0; i<20;i++){
            String[] parts =br.readLine().split(" ");
            j = j + Double.parseDouble(parts[1]);

            sum = Double.parseDouble(parts[1])*grade.get(parts[2])+sum;
            if (parts[2].equals("P")){
                j = j - Double.parseDouble(parts[1]);
            }


        }System.out.println(sum/j);

        
        
    }
}

