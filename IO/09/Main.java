
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class App {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String line = br.readLine();
      String[] parts = line.split(" ");
      int A = Integer.parseInt(parts[0]);
      int B = Integer.parseInt(parts[1]);  
      if (A > B) {
        bw.write(">");
        if (A < B){
            bw.write(">");
        }
        if (A == B){
            bw.write("==");
        }
      }

    bw.flush(); 
    br.close(); 
    bw.close();
    }
}
