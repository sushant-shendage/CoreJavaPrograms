
public class ArrayTwoPointerPrinting {
    public static void main(String[] args) {

        int[] arr1 = { 77, 9, 67, 48, 57, 0, 94, 21, 7, 22, 20 };

        for (int i = 0; i < arr1.length / 2; i++) {
            System.out.println(arr1[i] + "," + arr1[arr1.length - 1 - i]);

        }
        if ((arr1.length-1) % 2 == 0) {
            System.out.println(arr1[arr1.length / 2]);
        }
    }

}
