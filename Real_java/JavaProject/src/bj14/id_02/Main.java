package bj14.id_02;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] aa=br.readLine().split(" ");

        int Ns = Integer.parseInt(aa[0]);
        int Nx = Integer.parseInt(aa[1]);
        Set<String> example = new HashSet<>();
        for (int i = 0; i < Ns; i++) {
            String a = br.readLine();
            example.add(a);
        }

        int cnt =0;
        
        for (int i = 0; i < Nx; i++) {
            String x = br.readLine();
            if (example.contains(x)) {
                cnt++;
            }
        }
        System.out.println(cnt);


    }
}