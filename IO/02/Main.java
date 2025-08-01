
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String line = br.readLine();
      String[] parts = line.split(" "); //2개 이상의 element의 연산을 다루고 싶을때 (정규표현식)
      int a = Integer.parseInt(parts[0]);
      int b = Integer.parseInt(parts[1]);
      bw.write(a + b + ""); //int는 출력이 안되므로 왼쪽과 같이 문자열로 바꾸어 주어야함.
      bw.flush(); //buffer를 사용한다면 이로 출력시켜야함
      br.close(); //점유만 하므로 굳이 안해도 되긴함
      bw.close();
  }
}
