package bj04.id_09;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Array생성
        String line = br.readLine();
        String[] parts = line.split(" ");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        String[] list = new String[N];
        // for문 max
    
        for(int a=0; a<N; a++) {
            list[a]=String.valueOf(a+1);
            // System.out.println(Arrays.toString(list));
        }
        // System.out.println(Arrays.toString(list));
        // sorting하는 법
        // i와 j를 입력

        for(int a=0; a<M; a++) {
            String ij = br.readLine();
            String[] i_j = ij.split(" ");
            int i = Integer.parseInt(i_j[0])-1;
            int j = Integer.parseInt(i_j[1])-1;
            // for(int b=0; b<j; b++){
            //     int i_0 = i+b;
            //     int j_0 = j-b;
            //     if (i_0 == j_0 || j_0 - i_0 == 1){break;}
            //     String temp=list[i_0];
            //     list[i_0]=list[j_0];
            //     list[j_0]=temp;
            // }
            while (i < j) { // 간단하게 바꿔보자
                String temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }

        }
        System.out.println(String.join(" ", list));
        //int a =0;
        // i_0 = i+a++ j_0 = j-a++ (i<j)
        // if (i_0==j_0 || j_0-i_0==1;){break;}
        // b=list[i_0];
        // list[i_0]=list[j_0];
        // list[j_0]=b;

        br.close();

    }
    
}