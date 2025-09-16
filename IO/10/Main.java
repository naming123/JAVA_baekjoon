
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String line = br.readLine();
      int line2 = Integer.parseInt(line);
      String line1 = br.readLine();
      
      String a = line1.substring(0,1);
      String b = line1.substring(1,2);
      String c = line1.substring(2,3);

      int A = Integer.parseInt(a);
      int B = Integer.parseInt(b);
      int C = Integer.parseInt(c);

      bw.write(C*line2+ "\n");
      bw.write(B*line2+ "\n");
      bw.write(A*line2+ "\n");
      bw.write((A*100+B*10+C*1)*line2+"");
      
      bw.flush(); 
      br.close(); 
      bw.close();
  }
}

