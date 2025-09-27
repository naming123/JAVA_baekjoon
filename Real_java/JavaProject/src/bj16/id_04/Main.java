package bj16.id_04;

import java.io.*;

public class Main {
    static String input;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input =br.readLine();
        while (!input.equals(".")){
            if(Bracky (input)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            };

            input = br.readLine();
        }
    }

    // input 검사
    // small, big 검사

    // ([)] 이런거는 안되는 것임
    static boolean Bracky(String input) {
        boolean isValid = true;
        char[] stack = new char[input.length()];
        int top = -1;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(' || c == '[') {
                stack[++top] = c;                 // push
            } else if (c == ')') {
                if (top < 0 || stack[top--] != '(') { 
                    isValid = false;
                    break;
                }
            } else if (c == ']') {
                if (top < 0 || stack[top--] != '[') { 
                    isValid = false;
                    break;
                }
            }
        }

        return isValid && top == -1;
    }

}
