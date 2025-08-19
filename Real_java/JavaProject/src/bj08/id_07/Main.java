package bj08.id_07;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input =br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);
        

        int day =(V-A)/(A-B)+1;

        if ((V-A)%(A-B)!=0){
            System.out.println(day+1);
        }else{
            System.out.println(day);
        }
        


        
    }
}

        