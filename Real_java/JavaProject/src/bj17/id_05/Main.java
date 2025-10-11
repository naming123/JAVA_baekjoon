package bj17.id_05;

import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] NM = br.readLine().trim().split("\\s+");
            long N = Long.parseLong(NM[0]);
            long M = Long.parseLong(NM[1]);

        
            long n = Math.max(N, M);
            long r = Math.min(N, M);

            out.append(nCrBig(n, r)).append('\n');
        }
        System.out.print(out);
    }


    static BigInteger nCrBig(long n, long r) {
        if (r < 0 || r > n) return BigInteger.ZERO;
        r = Math.min(r, n - r);
        BigInteger res = BigInteger.ONE;
        for (long i = 1; i <= r; i++) {
        
            res = res.multiply(BigInteger.valueOf(n - r + i))
                     .divide(BigInteger.valueOf(i));
        }
        return res;
    }
}
