package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Opening an existing file in append mode

public class Main3 {
    public static void main(String[] args) throws IOException {
       FileInputStream fileInputStream=new FileInputStream("D:/newFile.txt");
        int readValue;
        while((readValue = fileInputStream.read()) !=-1) {
            System.out.print((char) readValue);
        }

        fileInputStream.close();

    }
}
