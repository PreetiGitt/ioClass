package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//  if open an existing file, previous content is lost

public class Main1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("D:/abc.txt");
        //fileOutputStream.write("creating a file at some location".getBytes());

      // fileOutputStream.write("Doing something new".getBytes());

        fileOutputStream.close();

    }
}
