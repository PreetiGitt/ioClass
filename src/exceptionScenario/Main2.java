package exceptionScenario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//static var are not written to  Object Stream
public class Main2 {
    public static void main(String[] args) throws IOException {
        B obj=new B();
        obj.a=1;
        obj.b=2;

        FileOutputStream fos=new FileOutputStream("d:/practice/one.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
    }
}
