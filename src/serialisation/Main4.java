package serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// 
/*class C implements Serializable{
    String name;
    C(){

    System.out.println("Inside C");
}
}
class D extends C  {
 int roll;
 String name;



}*/
public class Main4{
    public static void main(String[] args) throws IOException {
        D obj=new D();
        obj.name="D name";
        obj.roll=1;
        FileOutputStream fos=new FileOutputStream("d:/practice/Three.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);

    }
}
