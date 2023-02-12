package serialisation;

import java.io.Serializable;

public class C implements Serializable {
    String name;
    C(){

        System.out.println("Inside C");
    }
}
