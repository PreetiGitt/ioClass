package exceptionScenario2;

import java.io.*;

class Student implements Externalizable {
private int roll;
 private String name;

 public Student(){

 }
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(roll);
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
       roll= in.readInt();
      // name= in.readUTF();

    }
}
public class Main2 {
    public static void main(String[] args) throws IOException {
        Student st1=new Student(1,"S1");
        Student st2=new Student(2,"S2");
        FileOutputStream fos=new FileOutputStream("d:/practice/three.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(st1);
        oos.writeObject(st2);
    }
}
