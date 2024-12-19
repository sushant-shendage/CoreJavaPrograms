
import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String s1 = "DemoString";

        char a[] = new char[s1.length()];

        for (int i = 0; i < a.length; i++) {
            a[i] = s1.charAt(i);
        }

        System.out.println(Arrays.toString(a));

        String s2 = String.valueOf(a);
        String s3 = new String(a);

        System.out.println(s2);
        System.out.println(s3);
    }
}
