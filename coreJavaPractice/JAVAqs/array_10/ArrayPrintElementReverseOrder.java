
public class ArrayPrintElementReverseOrder {

    public static void main(String[] args) {
        int[] arr1 = { 77, 9, 67, 48, 57, 94, 21, 7, 22, 20 };

        for (int i = (arr1.length-1); i >= 0; i--) {
            System.out.println("arr1["+i+"] : " + arr1[i]);
        }

    }
}
