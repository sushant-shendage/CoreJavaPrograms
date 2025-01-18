// package javapgms.filehandling.serializationanddeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) throws Exception{
        String dataInput=new Scanner(System.in).next();
writeDataToFile(dataInput );
System.out.println("Excution completed..!");
    }
    static void writeDataToFile(String data) throws Exception{

        FileOutputStream fileOutput1=new FileOutputStream("C:\\Users\\susha\\OneDrive\\Desktop\\gitRepos\\javapgms\\filehandling\\serializationanddeserialization\\file1.txt");
        char ch;
        for (int i = 0; i < data.length(); i++) {
ch=data.charAt(i);
            fileOutput1.write(ch);
        }
    }
}
