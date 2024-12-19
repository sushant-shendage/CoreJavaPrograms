import java.util.Arrays;

public class arrRemoveMultipleOfElement {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 10, 15, 20, 77, 88 };
        int[] ans = new int[a.length - eleMul(a, 5)];
        int num = 5;

        System.out.println(Arrays.toString(a));
        for (int i = 0, j = 0; i < a.length; i++) {
            if (a[i] != num && a[i] % 5 != 0) {
                ans[j] = a[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(ans));
    }

    static int eleMul(int[] arr, int num) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num || arr[i] % 5 == 0) {
                count++;
            }
        }
        return count;
    }
}
