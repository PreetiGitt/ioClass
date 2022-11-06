package fileClass;

import java.io.File;
//File holds the ref of file/ directory
public class Main1 {
    public static void main(String[] args) {
       // File file= new File("D:/ioFile/one.txt");
        File file= new File("D:/ioFile/ioFile1");// takes ref of directory or resource


        System.out.println(file.exists());

     file.delete(); // only deletes an empty directory/file
    }
}
