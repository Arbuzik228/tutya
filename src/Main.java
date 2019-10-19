import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        //строка
        String tut;
        tut= "Hello World!";
        String plarupasHello = "Hello World!";
       final String VOLODYA = "Hello World!";
        System.out.println(tut);
        byte tuttop=123;
        short zdes=12345;
        int guguga=1234567890;
        int geguga=1234567890;
      geguga=guguga+666228;
        System.out.println(geguga);
        geguga+=1233456657;
        //драстеееееееееееееее
        geguga+=1;
        float gym=123.456f;
        double hop=1234567890.12345;
        char pool='f';
        boolean wind=true;
        tut="tuttop";
        System.out.println(tut);
        System.out.println("Enter your name: ");
        BufferedReader kek = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = kek.readLine();
            System.out.println("Hello, " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
