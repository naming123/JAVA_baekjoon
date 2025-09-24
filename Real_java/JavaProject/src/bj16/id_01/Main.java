package bj16.id_01;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] com = br.readLine().split(" ");
            int command = Integer.parseInt(com[0]);

            if (command == 1) {
                put(Integer.parseInt(com[1]));
            } else if (command == 2) {
                p2();
            } else if (command == 3) {
                p3();
            } else if (command == 4) {
                p4();
            } else {
                p5();
            }
        }
    }

    static void put(int a) {
        stack.add(a);
    }

    static void p2() {
        if (stack.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(stack.remove(stack.size() - 1));
        }
    }

    static void p3() {
        System.out.println(stack.size());
    }

    static void p4() {
        if (stack.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static void p5() {
        if (stack.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(stack.get(stack.size() - 1));
        }
    }
}
