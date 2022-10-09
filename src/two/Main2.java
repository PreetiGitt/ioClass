package two;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
// Nothing gets written in the file as not Closing
public class Main2 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("D:/fileWriter.txt");
      fileWriter.write("writing with fileWriter");


    }
}
