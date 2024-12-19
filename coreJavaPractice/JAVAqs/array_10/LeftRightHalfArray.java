import java.util.Arrays;

public class LeftRightHalfArray {
    public static void main(String[] args) {
        int[] a = { 4, 1, 2, 3, 6, 7, 8, 5 };
        int[] b = new int[a.length];

        int first = a[0], last = a[a.length - 1];

        for (int i = 0; i < a.length / 2 - 1; i++) {
            b[i] = a[i + 1];
        }
        b[a.length / 2 - 1] = first;

        for (int i = a.length - 1; i > a.length / 2; i--) {
            b[i] = a[i - 1];
        }
        b[a.length / 2] = last;
        System.out.println(Arrays.toString(b));

    }
}
