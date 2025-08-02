package id_05;

import java.io.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String total1 = br.readLine();
        int total =Integer.parseInt(total1);
        String number1 = br.readLine();
        int number =Integer.parseInt(number1);
        // String[] parts;
        String A="0";
        // int a1=0,b1=0; // java는 안에서 변수를 선언하면 안된다.
        //   List<Integer> list = Arrays.stream(br.readLine().split(" "))
        //           .mapToInt(Integer::parseInt)
        //           .boxed()
        //           .collect(Collectors.toList());
        // 한번에 문자열을 int로 바꾸는 함수 (배열로 받음)
        int A2 = 0;
        for (int i=0;i<number;i++){
            A = br.readLine();
            String[] parts =A.split(" ");
            int a1 = Integer.parseInt(parts[0]);
            int b1 = Integer.parseInt(parts[1]);
            A2 = a1*b1+A2;
            // System.out.println(A2);
        }

        if(total==A2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        br.close();
    }
}
