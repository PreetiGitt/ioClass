package exceptionScenario2;

import java.io.*;


public class Main3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis=new FileInputStream("d:/practice/three.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
       Student st1=(Student) ois.readObject();
        System.out.println("Roll"+st1.getRoll()+" Name"+st1.getName());
        Student st2=(Student) ois.readObject();
        System.out.println("Roll"+st2.getRoll()+" Name"+st2.getName());
    }
}
