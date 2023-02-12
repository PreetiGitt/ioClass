package exceptionScenario;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeB {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fos=new FileInputStream("d:/practice/one.txt");
        ObjectInputStream oos=new ObjectInputStream(fos);

        B obj=(B)oos.readObject();

        System.out.println(obj.a+"=="+ obj.b+"=="+ obj.c+"=="+ obj.d);
    }
}
