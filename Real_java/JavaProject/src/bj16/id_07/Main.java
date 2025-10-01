package bj16.id_07;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int st = Integer.parseInt(input[1]);

        // st번째 수를 보고 st만큼 다음 수를 고르고 
        // 만약 st로 더했는데 N을 넘으면 N을 빼고 다시 시작
        // 하나씩 append
        List<Integer> list = Arrays.asList(3, 6, 2, 7, 5, 1, 4);
        String result = list.toString().replace('[', '<').replace(']', '>');
        System.out.println(result); 


    }
}
