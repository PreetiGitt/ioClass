package readFromFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// fileInputStream.read(arr)
public class Main5 {
    public static void main(String[] args)  {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:/seven.txt");
            byte[] arr=new byte[500];
            int val=fileInputStream.read(arr); // returns number of characters that are read
            System.out.println(val);
            FileOutputStream fileOutputStream=new FileOutputStream("D:/eight.txt");

            fileOutputStream.write(arr, 0, val);
          /*  String str=new String(arr);
            System.out.println(str);*/

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
