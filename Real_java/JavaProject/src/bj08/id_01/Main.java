package bj08.id_01;

import java.io.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a =br.readLine().split(" ");
        
        
        int num = Integer.parseInt(a[1]);

        
        // entry는 mapof와 다르게 10개 이상도 가능함.
        Map<Character, Integer> map = Map.ofEntries(
            Map.entry('0', 0), // 0을 뻬먹지말자
            Map.entry('1', 1),
            Map.entry('2', 2),
            Map.entry('3', 3),
            Map.entry('4', 4),
            Map.entry('5', 5),
            Map.entry('6', 6),
            Map.entry('7', 7),
            Map.entry('8', 8),
            Map.entry('9', 9),
            Map.entry('A', 10),
            Map.entry('B', 11),
            Map.entry('C', 12),
            Map.entry('D', 13),
            Map.entry('E', 14),
            Map.entry('F', 15),
            Map.entry('G', 16),
            Map.entry('H', 17),
            Map.entry('I', 18),
            Map.entry('J', 19),
            Map.entry('K', 20),
            Map.entry('L', 21),
            Map.entry('M', 22),
            Map.entry('N', 23),
            Map.entry('O', 24),
            Map.entry('P', 25),
            Map.entry('Q', 26),
            Map.entry('R', 27),
            Map.entry('S', 28),
            Map.entry('T', 29),
            Map.entry('U', 30),
            Map.entry('V', 31),
            Map.entry('W', 32),
            Map.entry('X', 33),
            Map.entry('Y', 34),
            Map.entry('Z', 35)
        );
        
        
        int n = a[0].length(); // a[0]의 길이를 구해서 for문의 마지막
        long sum =0;
        for (int i=0; i< n; i++){
            sum = map.get(a[0].charAt(n-i-1))*(long)Math.pow(num, i)+sum; // ^i(XOR)가 제곱이 아니라 pow를 써야한다. (이는 double을 출력하기 때문에 출력형식을 유의해야한다.)
            // System.out.println(num);
            // System.out.println(num^i);
            // System.out.println(a[0]);
            // System.out.println(a[0].charAt(i)); // 자기가 맵을 char를 썼는지, string을 썼는지 제대로 이해하자.
            // System.out.println(map.get(a[0].charAt(i)));

        }System.out.println(sum);



    }
}
        