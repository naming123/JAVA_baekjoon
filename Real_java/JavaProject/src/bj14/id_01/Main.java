package bj14.id_01;

import java.io.*;
import java.util.*;

public class Main {
    // sang 카드 보관용
    static Set<Integer> have;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int Ns = Integer.parseInt(br.readLine());
        have = new HashSet<>(Ns); // 있는지 없는지만 판단 (굳이 중복으로 저장할 필요가 없음)

        String[] sang = br.readLine().split(" ");
        for (int i = 0; i < Ns; i++){
            have.add(Integer.parseInt(sang[i])); // 집합에 저장
        } 


        int Nx = Integer.parseInt(br.readLine());
        String[] sangx = br.readLine().split(" ");

        for (int i = 0; i < Nx; i++){
            sb.append(have(sangx[i])).append(" ");
        } 
        System.out.print(sb.toString().trim());
    }

    // a가 sang에 있으면 1, 없으면 0
    static int have(String a) {
        int v = Integer.parseInt(a);
        return have.contains(v) ? 1 : 0; // 삼항연산자 
        // if have.contains(v) return 1 else 0
    }

}
        