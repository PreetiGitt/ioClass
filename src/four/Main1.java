package four;

import java.io.*;
import java.util.Scanner;

//PrintWriter
public class Main1 {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter=new FileWriter("D:/ioFile/Twelve.txt");
        PrintWriter printWriter=new PrintWriter(fileWriter);
         printWriter.println("printWriterDemo");
         printWriter.println(113123);
         printWriter.println(true);

         printWriter.flush();
        }






}
