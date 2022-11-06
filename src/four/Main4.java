package four;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

// redirecting the std. input stream, reading from file
public class Main4 {
    public static void main(String[] args) throws IOException {

       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int val=sc.nextInt();
        System.out.println(val);*/
       FileInputStream fileInputStream=new FileInputStream("D:/ioFile/Thirteen.txt");



        System.setIn(fileInputStream);

        Scanner sc1=new Scanner(System.in);
        String value=sc1.next();
        System.out.println(value);
    }






}
