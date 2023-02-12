package exceptionScenario;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//static var are not written to  Object Stream
public class Main1 {
    public static void main(String[] args) throws IOException {
        A obj=new A();
        obj.a=1;
        obj.staticVar=2;
        obj.transientVar=3;
        FileOutputStream fos=new FileOutputStream("d:/practice/one.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
    }
}
