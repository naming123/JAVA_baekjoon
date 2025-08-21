package bj10.id_05;

import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        // 데이터범위를 정확히 이해하자.
        // 큰수와 음수범위포함인지?
        int num = Integer.parseInt(br.readLine());

        for (int i=0;i<num;i++){
            String[] a = br.readLine().split(" ");
            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);
            maxX = max(maxX,x);
            maxY = max(maxY,y);
            minX = min(minX,x);
            minY = min(minY,y);
        }
        int ans = (maxX-minX)*(maxY-minY);

        System.out.println(ans);
    }    
    static int min(int a, int b){
        if (a<b){
            return a;
        }else{
            return b;
        }

    }
    static int max(int a, int b){
        if (a>b){
            return a;
        }else{
            return b;
        }

    }
}
        