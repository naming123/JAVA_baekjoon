
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String line = br.readLine();
      String[] parts = line.split(" "); 
      int a = Integer.parseInt(parts[0]); 
      int b = Integer.parseInt(parts[1]); 
      bw.write(a + b + ""+ "\n"); 
      bw.write(a - b + ""+ "\n"); 
      bw.write(a * b + ""+ "\n"); 
      bw.write(a / b + ""+ "\n"); 
      bw.write(a % b + ""+ "\n"); // 몫이 아닌 나머지를 뽑고 싶을 때
      bw.flush(); 
      br.close(); 
      bw.close();
  }
}
