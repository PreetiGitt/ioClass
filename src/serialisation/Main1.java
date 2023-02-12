package serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable {
 int roll;
 String name;

    public Student(int roll, String name) {
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
public class Main1 {
    public static void main(String[] args) throws IOException {

        Student s1=new Student(5, "Preeti");
        FileOutputStream fos=new FileOutputStream("d:/practice/one.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);

    }
}
