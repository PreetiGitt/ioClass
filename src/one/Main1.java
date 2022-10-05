package one;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream=new DataInputStream(System.in);
      //  int read= dataInputStream.read();-- takes a single character
        //System.out.println("value is:"+read);
       // System.out.println((int)'h'); // ascii code

        String str=dataInputStream.readLine();
        System.out.println(str);

    }
}
