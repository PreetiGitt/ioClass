package readFromFile;

import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args)  {
        try {
            FileReader fileReader = new FileReader("D:/six.txt");
            char[] arr=new char[500];
            fileReader.read(arr);
            String str=new String(arr);
            System.out.println(str);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
