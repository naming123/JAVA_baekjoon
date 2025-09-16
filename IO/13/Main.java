
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      // String line = br.readLine();
      
      // String[] parts = line.split(" ");
    
      // long a = Long.parseLong(parts[0]);
      // long b = Long.parseLong(parts[1]);
      // long c = Long.parseLong(parts[2]);
      bw.write("|\\_/|"+"\n");
      bw.write("|q p|   /}"+"\n");
      bw.write("( 0 )\"\"\"\\"+"\n");
      bw.write("|\"^\"`    |"+"\n");
      bw.write("||_/=\\\\__|"+"\n");
      

      
      bw.flush(); 
      br.close(); 
      bw.close();
  }
}

