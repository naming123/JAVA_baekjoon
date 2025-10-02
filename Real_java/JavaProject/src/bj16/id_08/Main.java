package bj16.id_08;

import java.io.*;
import java.util.*;

public class Main {
    static Deque<String> dq = new ArrayDeque<>();
    // array로도 선언할 수 있고, => 빠름
    // linkedlist로도 선언할 수 있다. => 중간 삽입/삭제에 유리
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++ ){
            String[] command = br.readLine().split(" ");
            String a = controller(command);
            if (a!=null)bw.write(a+"\n"); 
        }
        bw.flush();
        bw.close();
    }


    static String controller(String[] command) {
        switch (command[0]) {
            case "1": // 삽입
                dq.addFirst(command[1]); 
                return null;
            case "2":
                dq.addLast(command[1]); 
                return null;
            case "3": // pop = poll
                return dq.isEmpty() ? "-1" : dq.pollFirst();
            case "4":
                return dq.isEmpty() ? "-1" : dq.pollLast();
            case "5": // 개수
                return String.valueOf(dq.size());
            case "6": // empty
                return dq.isEmpty() ? "1" : "0";
            case "7": // 있는지?(peek)
                return dq.isEmpty() ? "-1" : dq.peekFirst();
            case "8":
                return dq.isEmpty() ? "-1" : dq.peekLast();
            default:
                return null;
        }
    }
}

            
