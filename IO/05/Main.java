
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String line = br.readLine();
      String[] parts = line.split(" "); 
      double a = Integer.parseInt(parts[0]); //자바 나누기에서 정수는 몫만 출력
      double b = Integer.parseInt(parts[1]); //문제는 소수점 출력을 원했으므로 타입변환이 필요
      bw.write(a / b + ""); 
      bw.flush(); 
      br.close(); 
      bw.close();
  }
}
