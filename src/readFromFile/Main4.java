package readFromFile;

import java.io.FileInputStream;
import java.io.IOException;

// reading
public class Main4 {
    public static void main(String[] args)  {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:/six.txt");
            byte[] arr=new byte[fileInputStream.available()];
            fileInputStream.read(arr,0,5);
            String str=new String(arr);
            System.out.println(str);

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
