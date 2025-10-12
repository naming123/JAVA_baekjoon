package bj18.id_01;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());   
        String[] pool = br.readLine().split(" "); 
        
        while (pool.length < cnt) {
            String[] more = br.readLine().split(" ");
            String[] merged = new String[pool.length + more.length];
            System.arraycopy(pool, 0, merged, 0, pool.length);
            System.arraycopy(more, 0, merged, pool.length, more.length);
            pool = merged;
        }

        int[] a = new int[cnt];
        for (int i = 0; i < cnt; i++) a[i] = Integer.parseInt(pool[i]);

        Arrays.sort(a); 

        long N = (cnt == 1) ? (long)a[0] * a[0] : (long)a[0] * a[cnt - 1];
        System.out.println(N);
    }
}


