package three;

import java.io.*;
import java.util.Scanner;

// DataOutputStream creates a file of   4 bytes in this case
public class Main2 {
    public static void main(String[] args) throws IOException {


        FileInputStream file=new FileInputStream("D:/Eleven.txt");


        DataInputStream dataInputStream=new DataInputStream(file);
        while(dataInputStream.available()>0) {
            int var = dataInputStream.readInt();
            String str = dataInputStream.readUTF();
            double salary = dataInputStream.readDouble();
            boolean special = dataInputStream.readBoolean();
            System.out.println(var);
            System.out.println(str);
            System.out.println(salary);
            System.out.println(special);

        }
    }
}
