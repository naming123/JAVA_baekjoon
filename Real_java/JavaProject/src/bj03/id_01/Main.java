package bj03.id_01;


public class Main {
    public static void main(String[] args) throws Exception {
        int a = System.in.read()-'0'; //"0"이랑 -'0' 둘이 뭐가 다른거지?
        for (int i =1; i<10;i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }

    }
}
