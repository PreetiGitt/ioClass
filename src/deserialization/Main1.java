package deserialization;

import serialisation.D;

import java.io.*;

//

public class Main1{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fos=new FileInputStream("d:/practice/Three.txt");
        ObjectInputStream oos=new ObjectInputStream(fos);

        D obj=(D)oos.readObject();
        System.out.println(obj.name+"=="+obj.roll);

    }
}
