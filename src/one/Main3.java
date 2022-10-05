package one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main3 {
    public static void main(String[] args) throws IOException {
        /*StringReader stringReader=new StringReader("Hello");*/
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
       String readConsole= bufferedReader.readLine();
        System.out.println(readConsole);
    }
}
