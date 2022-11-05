package four;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//PrintWriter
public class Main2 {
    public static void main(String[] args) throws IOException {

       FileReader fileReader=new FileReader("D:/ioFile/Twelve.txt");
       int var;
     while((var=fileReader.read())!=-1)

         System.out.print((char)var);

        }






}
