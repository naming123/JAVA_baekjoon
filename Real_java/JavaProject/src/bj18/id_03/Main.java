package bj18.id_03;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 

        Set<String> dance = new HashSet<>();
        dance.add("ChongChong"); 

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            String a = parts[0];
            String b = parts[1];

         
            if (dance.contains(a) || dance.contains(b)) {
                dance.add(a);
                dance.add(b);
            }
        }

        System.out.println(dance.size());
    }
}

