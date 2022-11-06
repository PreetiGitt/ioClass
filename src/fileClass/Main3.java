package fileClass;

import java.io.File;

//File holds the ref of file/ directory
public class Main3 {
    public static void main(String[] args) {
       // File file= new File("D:/ioFile/one.txt");
        File file= new File("D:/ioFile/ioFile1/one.txt");// takes ref of directory or resource


        System.out.println(file.exists());
        System.out.println(file.isFile());
   /* if(file.isFile())
     file.delete(); */// only deletes an empty directory/file

        // rename
        File file1=new File("D:/ioFile/ioFile1/two.txt");
        file.renameTo(file1);
    }
}
