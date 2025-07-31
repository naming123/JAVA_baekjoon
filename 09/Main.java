
import java.io.*;


public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String line = br.readLine();
      int a = Integer.parseInt(line);
      int b = 543;
      bw.write(a-b+ "");
      bw.flush(); 
      br.close(); 
      bw.close();
  }
}

