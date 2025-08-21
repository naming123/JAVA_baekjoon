package bj10.id_03;

import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mx = 0, my = 0;
        for (int i = 0; i < 3; i++) {
            String[] t = br.readLine().trim().split("\\s+");
            int x = Integer.parseInt(t[0]);
            int y = Integer.parseInt(t[1]);
            mx ^= x;
            my ^= y;
        }
        System.out.println(mx + " " + my);
    }
}
        