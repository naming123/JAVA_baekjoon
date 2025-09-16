package bj06.id_06;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String AA = br.readLine();
        int size = AA.length();
        // 탐색
        List<Character> list = List.of('=', '-'); 
        List<Integer> idxs = new ArrayList<>();
        for (char target : list) {
            for (int i = 0; i < AA.length(); i++) {
                if (AA.charAt(i) == target) idxs.add(i);
            }
            // System.out.println(idxs);
        }

        size = size - idxs.size();

        // dz=
        int dz = 0, i = 0;
        while ((i = AA.indexOf("dz=", i)) != -1) {
            dz++;
            i += 3;                 
        }


        // nj lj
        int nj = 0;
        while ((i = AA.indexOf("nj", i)) != -1) {
            nj++;
            i += 3;                 
        }

        int lj = 0;
        while ((i = AA.indexOf("lj", i)) != -1) {
            lj++;
            i += 3;                 
        }
        
        System.out.println(size-dz-lj-nj);
        br.close();
        
    } 
}
