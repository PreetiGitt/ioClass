package exceptionScenario2;

import exceptionScenario2.A;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeA {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fos=new FileInputStream("d:/practice/one.txt");
        ObjectInputStream oos=new ObjectInputStream(fos);

      A obj=(A)oos.readObject();
        System.out.println(obj.a+"=="+obj.staticVar);// 1==0
        System.out.println(obj.a+"=="+obj.staticVar+"=="+ obj.transientVar);//1==0==0
    }
}
