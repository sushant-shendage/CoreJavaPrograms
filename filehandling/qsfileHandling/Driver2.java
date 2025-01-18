// package javapgms.filehandling.qsfileHandling;

import java.io.File;
import java.io.IOException;

public class Driver2 {
    public static void main(String[] args) throws IOException {
        File folder2=new File("our folder2");
        folder2.mkdir();

        File file99=new File("our folder2","file99");
        file99.createNewFile();
        

        
    }
}
