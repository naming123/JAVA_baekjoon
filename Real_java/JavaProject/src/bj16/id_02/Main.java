package bj16.id_02;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int cnt =0;
        int a =0;
        for (int i = 0; i < T; i++) {
            int com = Integer.parseInt(br.readLine());
            if (com == 0){
                a= stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                cnt= cnt-a;

            }else{
                stack.add(com);
                cnt=cnt+com;
                
            }

        }System.out.println(cnt);
    }

}
