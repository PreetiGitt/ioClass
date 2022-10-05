package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// Opening an existing file in append mode

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("D:/newFile.txt",true);
      //fileOutputStream.write("New file".getBytes());
        fileOutputStream.write(" New Content".getBytes());
        fileOutputStream.close();

    }
}
