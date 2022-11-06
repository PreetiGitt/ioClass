package four;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
// redirecting the std. output stream
public class Main3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("D:/ioFile/Thirteen.txt");
        PrintStream printStream=new PrintStream(fileOutputStream);
      //  printStream.println("writing using printStream");
        printStream.println("writing in 2nd case");
        System.setOut(printStream);
        System.out.println("normal console");
        System.err.println("error msg"); // std error stream
        System.setOut(System.out);
        System.out.println("on console reset");
    }






}
