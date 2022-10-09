package two;

import java.io.FileWriter;
import java.io.IOException;

public class Main5 {
   public static void main(String[] args) throws IOException {
       FileWriter fileWriter=new FileWriter("D:/five.txt");

            fileWriter.write("Apple");
            fileWriter.flush();// clearing the buffer and content goes to the file

   }
}
