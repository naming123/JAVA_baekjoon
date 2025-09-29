package bj16.id_06;

import java.io.*;
import java.util.*;

public class Main {
    static LinkedList<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            String result = controller(command);
            if (result != null) {
                bw.write(result);
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }

    static String controller(String[] command) {
        switch (command[0]) {
            case "push":
                queue.add(Integer.parseInt(command[1])); // 맨 뒤 삽입
                return null;
            case "pop":
                return queue.isEmpty() ? "-1" : String.valueOf(queue.poll()); // 맨 앞 제거
            case "size":
                return String.valueOf(queue.size());
            case "empty":
                return queue.isEmpty() ? "1" : "0";
            case "front":
                return queue.isEmpty() ? "-1" : String.valueOf(queue.peekFirst());
            case "back":
                return queue.isEmpty() ? "-1" : String.valueOf(queue.peekLast());
            default:
                return null;
        }
    }
}
