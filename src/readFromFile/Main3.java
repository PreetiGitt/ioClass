package readFromFile;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
// reading whole file at once, not character by character
public class Main3 {
    public static void main(String[] args)  {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:/six.txt");
            byte[] arr=new byte[fileInputStream.available()];
            fileInputStream.read(arr);
            String str=new String(arr);
            System.out.println(str);
            System.out.println(arr.length);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
