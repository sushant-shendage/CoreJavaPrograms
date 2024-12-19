import java.util.Arrays;

public class ShiftArr {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int[] b = { 11, 22, 33, 44 };
        int[] c = { 10,20,30,40 };

        // System.out.println("----LEFT SHIFT---------");
        // System.out.println(Arrays.toString(a));
        // leftShiftArrayApproch1(a);
        // System.out.println(Arrays.toString(a));
        // System.out.println("-----------------------");

        // System.out.println("----LEFT SHIFT N TIMES---------");
        // System.out.println(Arrays.toString(b));
        // leftShiftArrayApproch1Ntimes(b, 2);
        // System.out.println(Arrays.toString(b));
        // System.out.println("--------------------------------");

        System.out.println("----Right SHIFT---------");
        System.out.println(Arrays.toString(c));
        leftShiftArrayApproch1(c);
        System.out.println(Arrays.toString(c));
        System.out.println("-----------------------");

    }

    static void leftShiftArrayApproch1(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    static void leftShiftArrayApproch2(int[] arr) {
        int first = arr[0];
        for (int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    static void leftShiftArrayApproch1Ntimes(int[] arr, int rotation) {
        for (int j = 1; j <= rotation; j++) {
            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = first;
        }
    }

    static void rightShiftArrayApproch1(int[] arr) {

        int last = arr[arr.length];
        for (int i = arr.length; i > 0; i--) {

            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    // static void rightShiftArrayApproch1Ntimes() {

    // }
}
