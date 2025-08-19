package bj08.id_04;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n번일 때 사각형개수는 4^n개다.
        // 각 사각형을 왼쪽 위 점에 대응시키면 전체 큰 사각형에서 마지막 가로 세로줄을 제외한 모든 점이 세진다.
        // 전체 큰 사각형은 2^n+1개의 점으로 가로세로가 각각 만들어져있다.
        // 그렇기 때문에 전체 점을 모두 세면 (2^n+1)^2이다.

        double a = Math.pow(Math.pow(2,Double.parseDouble(br.readLine()))+1,2);
        int b = (int) a; // cast변환

        System.out.println(b);

    }
}

