import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Driver4FileWriter {
    public static void main(String[] args) throws IOException {
        FileReader fRObj = new FileReader(".//demo.txt");

        for (int i = fRObj.read(); i != -1; i = fRObj.read()) {
            System.out.print((char) i);
        }

        System.out.println();
        File fileClassObject = new File(".//demo.txt");
        FileReader fRObj2 = new FileReader(fileClassObject);

        for (int i = fRObj2.read(); i != -1; i = fRObj2.read()) {
            System.out.print((char) i);
        }
    }
}
