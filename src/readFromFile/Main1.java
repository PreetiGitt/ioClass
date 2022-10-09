package readFromFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args)  {
        try {
            FileReader fileReader = new FileReader("D:/Pic1.jpg");
            int val;
            while((val=fileReader.read())!=-1){
                System.out.print((char)val);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
