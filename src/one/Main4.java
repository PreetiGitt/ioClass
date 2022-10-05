package one;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
    public static void main(String[] args) /*throws IOException*/ {

        Console console=System.console();
       String str= console.readLine(); // doesn't throw IO Exception

        System.out.println(str);
    }
}
