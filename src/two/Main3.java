package two;

import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        // character stream requires to close() , to empty the buffer

        FileWriter fileWriter=new FileWriter("D:/one.txt");
      fileWriter.write("writing with fileWriter");
fileWriter.close();
       
    }
}
