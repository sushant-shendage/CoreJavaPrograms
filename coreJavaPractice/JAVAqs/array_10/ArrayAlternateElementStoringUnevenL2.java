import java.util.Arrays;

public class ArrayAlternateElementStoringUnevenL2 
{
    public static void main(String[] args) 
    {

        int[] b = { 11, 22, 33, 44 };
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };

        int[] c = new int[a.length + b.length];

        if (b.length > a.length) {
            for (int i = 0, j = 0; i < c.length; i += 2, j++) {
                if (i < 2 * (a.length)) {
                    c[i] = a[j];
                    c[i + 1] = b[j];
                } else {
                    c[i] = b[j];
                    i--;
                }

            }

        } else {
            for (int i = 0, j = 0; i < c.length; i += 2, j++) {
                if (i < 2 * (b.length)) {
                    c[i] = a[j];
                    c[i + 1] = b[j];
                } else {
                    c[i] = a[j];
                    i--;
                }

        }

        System.out.println(Arrays.toString(c));
    }
}

}
