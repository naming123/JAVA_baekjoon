package bj14.id_07;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] aa = br.readLine().split(" ");
        int a =Integer.parseInt(aa[0]);
        int b =Integer.parseInt(aa[1]);

        Set<String> A = new HashSet<>();
        Set<String> B = new HashSet<>();
        Set<String> B1 = new HashSet<>();
        String[] a1 = br.readLine().split(" ");
        for (int i =0; i<a;i++){ 
            A.add(a1[i]);
        }
        String[] b1 = br.readLine().split(" ");
        for (int i =0; i<b;i++){
            B.add(b1[i]);
            B1.add(b1[i]);
        }
        B1.removeAll(A);
        A.removeAll(B);

        int cnt = A.size()+B1.size();
        System.out.println(cnt);


    }
}

