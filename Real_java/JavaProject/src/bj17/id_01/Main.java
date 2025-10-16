package bj17.id_01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println(N*(N-1));
    }
}

