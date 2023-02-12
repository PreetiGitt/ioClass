package serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// All the references in the class to be serialized must also be serializable
class B{
    String name;
B(){

    System.out.println("Inside B");
}
}
class A implements Serializable {
 int roll;
 String name;
 B objB;

    public A(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }
}
public class Main2{
    public static void main(String[] args) throws IOException {

        A s1=new A(5, "Preeti");
        s1.objB=new B();
        s1.objB.name="Class B";
        FileOutputStream fos=new FileOutputStream("d:/practice/Three.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);

    }
}
