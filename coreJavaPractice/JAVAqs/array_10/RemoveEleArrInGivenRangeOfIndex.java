import java.util.Arrays;

public class RemoveEleArrInGivenRangeOfIndex {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 6, 7, 8, 9, 10, 4, 5 };
        int start = 3, end = 7;
        int[] temp = new int[a.length - (end - start + 1)];

        System.out.println("Original" + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (i < start) {
                temp[i] = a[i];
            } else if (i > end) {

                temp[i - (end - start + 1)] = a[i];

            }
        }
        System.out.println("Modified" + Arrays.toString(temp));
    }

}
