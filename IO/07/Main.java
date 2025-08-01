
import java.io.*;
import java.util.*;


public class Main {
  public static void main(String[] args) throws IOException {
      Set<String> set = new HashSet<String>(); // 중복X 집합설정
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String line = br.readLine();
      bw.write(line+"??!");
      // if(set.contains(line))
      //   bw.write(line+"??!");
      // else
      //   bw.write("ID is Generated"+"\n");
      //   set.add(line); //하나씩 고유 추가를 한다.
      // bw.flush(); 
      // // br.close(); 
      // // bw.close();
      // line = br.readLine();
      
      // if(set.contains(line))
      //   bw.write(line+"??!");
      // else
      //   bw.write("ID is Generated"+"\n");
      //   set.add(line); //하나씩 고유 추가를 한다.
      bw.flush(); 
      br.close(); 
      bw.close();
  }
}
