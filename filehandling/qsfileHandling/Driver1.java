// package javapgms.filehandling.qsfileHandling;

import java.io.File;
import java.io.IOException;

public class Driver1 {
    public static void main(String[] args) throws IOException{

        // //new File(String s/path)
        // File file1=new File("Demo.txt");

        // System.out.println("file present :"+file1.exists());

        // //creatNewFile() method
        // if (file1.createNewFile()) {
        //     System.out.println("file created successfully..!");
        // }else{
        //     System.out.println("file already exists..!");
        // }
        //----------------------------------------------------------------------------------------

       File folder1= new File("our folder");

        // if (folder1.mkdir()) {
        //     System.out.println("folder created successfully..!");
        // }else{
        //     System.out.println("folder already exists..!");
        // }

        //------------------------------------------------------------------------------------

        if (folder1.delete()) {
            System.out.println("folder deleted successfully..!");
        }else{
            System.out.println("folder not exists..!");
        }


    }
}
