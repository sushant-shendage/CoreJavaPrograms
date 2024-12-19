import java.util.Arrays;

public class RemoveEvenEleInArr {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int[] ans = new int[a.length - arrEvenEleCount(a)];
        System.out.println(Arrays.toString(a));

        for (int i = 0, j = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {

                ans[j] = a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    static int arrEvenEleCount(int[]arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                count++;
            }
        }
        return count;
    }

}
