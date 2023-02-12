package exceptionScenario2;

import exceptionScenario2.A;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//static var are not written to  Object Stream
public class Main1 {
    public static void main(String[] args) throws IOException {
        A obj=new A();
        obj.a=11;
        obj.staticVar=12;
        obj.transientVar=13;
        FileOutputStream fos=new FileOutputStream("d:/practice/one.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
    }
}
