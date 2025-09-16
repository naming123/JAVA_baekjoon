
import java.io.*;


public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String line = br.readLine();
      
      String[] parts = line.split(" ");
    
      int a = Integer.parseInt(parts[0]);
      int b = Integer.parseInt(parts[1]);
      // long c = Long.parseLong(parts[2]);
      if (a>b){
        bw.write(">");
      }
        
      else if (a<b){
        bw.write("<");
      }
        
      else{
        bw.write("==");
      }
        
      bw.flush(); 
      br.close(); 
      bw.close();
  }
}

