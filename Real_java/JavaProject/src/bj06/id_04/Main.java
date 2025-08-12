package bj06.id_04;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String AA = br.readLine();



        if(AA.length() == 1){
            System.out.println("1");

        }
        for(int i=1;i<AA.length()/2+1;i++){
            // System.out.println(1);
            // System.out.println(AA.length());

            if(AA.charAt(i) != AA.charAt(AA.length() - 1 - i)){
                System.out.println("0");
                break;
            }
            if(i == AA.length()/2){
                System.out.println("1");
                break;
            }
            // System.out.println("aa");

        }
        

        // System.out.println("4");
        // bw.close();
        br.close();
        
    } 
}
