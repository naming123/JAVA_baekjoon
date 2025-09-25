package bj16.id_03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String bracket = br.readLine();
            int cnt = 0;
            boolean isValid = true;

            for (int j = 0; j < bracket.length(); j++) {
                if (bracket.charAt(j) == '(') {
                    cnt++;
                } else {
                    cnt--;
                }

                if (cnt < 0) { // 닫는 괄호가 먼저 나오면 실패
                    isValid = false;
                    break;
                }
            }

            if (cnt == 0 && isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
