package two;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("D:/newFile1.txt",true);
        //fileOutputStream.write("New file".getBytes());
        fileOutputStream.write(" New File 1".getBytes());
       // fileOutputStream.close();
    }
}
