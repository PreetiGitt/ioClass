package two;

import java.io.FileWriter;
import java.io.IOException;
 /*Mango is not printed as Mango goes to buffer,
 as the buffer is emptied at first go
of 8192 bytes*/
public class Main4 {
    public static void main(String[] args) throws IOException {

// case of buffer overflow
        FileWriter fileWriter=new FileWriter("D:/four.txt");
        String str="";
        for(int i=0;i<(8193);i++) {
           str=str+"b";
        }
        fileWriter.write(str);
        fileWriter.write("Mango");

    }
}
