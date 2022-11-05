package three;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
// DataOutputStream creates a file of   4 bytes in this case
public class Main1 {
    public static void main(String[] args) throws IOException {


        FileOutputStream fileOutputStream=new FileOutputStream("D:/Eleven.txt");

        DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream);
        Scanner sc=new Scanner(System.in);
        char response='y';
        while(response=='y') {
            System.out.println("Enter a EmployeeNumber");

            int empNumber = sc.nextInt();
            System.out.println("Enter a EmpName");

            String name = sc.next();
            System.out.println("Enter a Salary");
            double salary = sc.nextDouble();
            System.out.println("Special?");
            boolean special = sc.nextBoolean();
            // integer takes 4 bytes

            dataOutputStream.writeInt(empNumber);
            dataOutputStream.writeUTF(name);
            dataOutputStream.writeDouble(salary);
            dataOutputStream.writeBoolean(special);
            System.out.println("Enter y to continue");
             response=sc.next().charAt(0);

        }






    }
}
