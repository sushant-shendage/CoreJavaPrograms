// package javapgms.filehandling.qsfileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Driver3 {
    public static void main(String[] args) throws IOException{
        FileWriter file22=new FileWriter("file22.txt",true);
        file22.write(100);
        file22.write("this is the sentese");
        char ch[]={'a','e','i'};
        file22.write(ch);
        file22.flush();

    }
}
