public class ArrayPalindrom {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 1 };
        int i, j;

        for (i = 0, j = a.length - 1; i <= j; i++, j--) {
            if (a[i] != a[j]) {
                break;
            }
        }

        if (i > j) {
            System.out.println("palindromic array");
        } else {
            System.out.println("NOT  a palindromic array");
        }
    }

}
