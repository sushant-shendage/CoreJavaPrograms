import java.util.Arrays;

public class Mergining2ArraysL3 {
    public static void main(String[] args) {

        int[] a = { 77, 98, 500, 48, 21, 44, 55 };
        int[] b = { 555, 666, 444 };

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[i-a.length];

            }
        }

        System.out.println(Arrays.toString(c));
    }

}
