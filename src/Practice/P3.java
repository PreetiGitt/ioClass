package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static void main(String[] args) {


        String str = "abcxdcbya";
      //  boolean []flag= new boolean[str.length()];
         boolean flag=false;

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            for (int j = str.length()-1; j>=i; j--) {
                  if(ch==str.charAt(j))
                     flag=true;

            }
            if(!flag){
                System.out.println("First non repeating element is "+ str.charAt(i));
                break;
            }
        }
     /* for (int k=0; k< flag.length; k++){
          if(flag[k]!=true){
              System.out.println("First non repeating element is "+ str.charAt(k));
              break;
          }
      }*/

    }


}







